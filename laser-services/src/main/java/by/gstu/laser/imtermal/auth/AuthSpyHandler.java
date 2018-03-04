package by.gstu.laser.imtermal.auth;

import org.apache.felix.scr.annotations.*;
import org.apache.sling.auth.core.spi.AuthenticationHandler;
import org.apache.sling.auth.core.spi.AuthenticationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component(immediate = true)
@Service
@Properties({
        @Property(name = "path", value = "/content/laser")
})
public class AuthSpyHandler implements AuthenticationHandler {

    private static final Logger LOG = LoggerFactory.getLogger(AuthSpyHandler.class);

    @Reference
    private AuthenticationHandler handler;

    @Override
    public AuthenticationInfo extractCredentials(HttpServletRequest request, HttpServletResponse response) {
        final AuthenticationInfo info = handler.extractCredentials(request, response);
        if (info != null && info.get("user.jcr.credentials") != null) {
            LOG.info("The following user [{}] has been connected to the system with [{}] auth type.",
                    info.getUser(), info.getAuthType());
        }
        return null;
    }

    @Override
    public boolean requestCredentials(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return handler.requestCredentials(request, response);
    }

    @Override
    public void dropCredentials(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handler.dropCredentials(request, response);
    }
}
