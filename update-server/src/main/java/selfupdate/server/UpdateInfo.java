package selfupdate.server;


import java.io.Serializable;

/**
 * UpdateInfo is a simple POJO (Plain Old Java Object) that holds information
 * about the client application update, such as version and URL.
 */
public class UpdateInfo implements Serializable {
    // The version of the client application
    private String version;
    // The URL to download the updated JAR file
    private String url;

    UpdateInfo(String version,  String url) {
        this.version = version;
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public String getUrl() {
        return url;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}