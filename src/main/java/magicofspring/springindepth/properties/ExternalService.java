package magicofspring.springindepth.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {

    // From property file
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
