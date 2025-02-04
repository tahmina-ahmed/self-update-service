package selfupdate.runner;


import java.io.Serializable;


public class VersionInfo implements Serializable {

    public String version;

    public String jar;

    public String url;

    public VersionInfo() {

    }

    public VersionInfo(String version, String jar, String url) {
    this.version = version;
    this.jar = jar;
    this.url = url;
    }

    public void update(VersionInfo version) {
        this.version = version.getVersion();
        this.jar = version.getJar();
        this.url = version.getJar();
    }

    public String getVersion() {
        return version;
    }

    public String getJar() {
        return jar;
    }

    public String getUrl() {
        return url;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setJar(String jar) {
        this.jar = jar;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
