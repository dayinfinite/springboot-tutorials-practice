package hello.storeage;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @author dayinfinite
 * @deprecated
 * @date 2019/01/16
 * */
@ConfigurationProperties("storage")
public class StorageProperties {
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
