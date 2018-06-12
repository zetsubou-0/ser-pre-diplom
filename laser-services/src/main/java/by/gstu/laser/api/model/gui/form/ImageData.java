package by.gstu.laser.api.model.gui.form;

import by.gstu.laser.api.util.RequestParams;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageData {

    private static Logger LOG = LoggerFactory.getLogger(ImageData.class);

    @Self
    private SlingHttpServletRequest request;
    private String originImageLink;
    private String blackWhiteImageLink;
    private String codeSourcePath;
    @ValueMapValue
    private String saveLinkText;

    @PostConstruct
    protected void init() {
        if (request == null) {
            LOG.warn("Request is null");
            return;
        }
        originImageLink = request.getParameter(RequestParams.ORIGINAL.getValue());
        blackWhiteImageLink = request.getParameter(RequestParams.BLACK_WHITE.getValue());
        codeSourcePath = request.getParameter(RequestParams.SOURCE.getValue());
    }

    public String getOriginImageLink() {
        return originImageLink;
    }

    public void setOriginImageLink(String originImageLink) {
        this.originImageLink = originImageLink;
    }

    public String getBlackWhiteImageLink() {
        return blackWhiteImageLink;
    }

    public void setBlackWhiteImageLink(String blackWhiteImageLink) {
        this.blackWhiteImageLink = blackWhiteImageLink;
    }

    public String getCodeSourcePath() {
        return getLink(codeSourcePath);
    }

    public void setCodeSourcePath(String codeSourcePath) {
        this.codeSourcePath = codeSourcePath;
    }

    public String getSaveLinkText() {
        return saveLinkText;
    }

    public void setSaveLinkText(String saveLinkText) {
        this.saveLinkText = saveLinkText;
    }

    public boolean isValid() {
        return StringUtils.isNoneEmpty(originImageLink, blackWhiteImageLink, codeSourcePath);
    }

    private String getLink(String linkPath) {
        return StringUtils.isEmpty(linkPath) ? "#" : linkPath;
    }
}
