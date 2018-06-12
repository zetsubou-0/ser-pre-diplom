package by.gstu.laser.api.util;

import by.gstu.laser.api.model.ImageModel;
import by.gstu.laser.imtermal.command.GCodeCommand;
import org.apache.commons.lang3.StringUtils;
import org.apache.jackrabbit.commons.JcrUtils;

import javax.imageio.ImageIO;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public final class IOUtil {

    private static final String EQUALS = "=";
    private static final String AND = "&";

    private IOUtil() {
    }

    public static String getParams(ImageModel image) {
        return new StringBuilder("?")
                .append(RequestParams.ORIGINAL.getValue()).append(EQUALS).append(image.getOriginImagePath()).append(AND)
                .append(RequestParams.BLACK_WHITE.getValue()).append(EQUALS).append(image.getBlackWhiteImagePath()).append(AND)
                .append(RequestParams.SOURCE.getValue()).append(EQUALS).append(image.getSourcePath())
                .toString();
    }

    public static String createImageFile(Session session, BufferedImage image, String rootPath, String name) throws RepositoryException, IOException {
        try (final ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            ImageIO.write(image, "jpg", out);
            final Node rootNode = JcrUtils.getOrCreateByPath(rootPath, "sling:Folder", session);
            if (rootNode == null) {
                return StringUtils.EMPTY;
            }
            return createFile(session, out, rootNode, name)
                    .getPath();
        } catch (RepositoryException e) {
            throw new IOException(e);
        }
    }

    public static String createFile(Session session, List<GCodeCommand> commands, String rootPath, String name) throws IOException, RepositoryException {
        final String content = commands.parallelStream()
                .map(GCodeCommand::getCommandLine)
                .collect(Collectors.joining())
                .trim();
        try (final ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            out.write(content.getBytes());
            return createFile(session, out, JcrUtils.getNodeIfExists(rootPath, session), name)
                    .getPath();
        }
    }

    private static Node createFile(Session session, ByteArrayOutputStream out, Node rootNode, String name) throws RepositoryException, IOException {
        try (final InputStream in = new ByteArrayInputStream(out.toByteArray())) {
            final Node imageNode = JcrUtils.putFile(rootNode, name, "image/jpeg", in);
            session.save();
            return imageNode;
        }
    }
}
