package selfupdate.server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UpdateController is a Spring Boot REST controller that provides an endpoint to retrieve
 * update information for the client application.
 */
@RestController
public class UpdateController {
    private int majorVersion = 1;
    private int minorVersion = 0;
    private int patch = 0;

    /**
     * Handles HTTP GET requests to the root endpoint ("/").
     *
     * @return a String response with a greeting message
     */
    @GetMapping("/")
    public String getInfo() {
        // Return the update information for the client application
        return "I am server!";
    }

    @GetMapping("/update")
    public UpdateInfo getUpdateInfo() {
        // Return the update information for the client application
        String version = simpleVersionGenerator();
        UpdateInfo updateInfo = new UpdateInfo(version, "http://example-host.com/self-update-service-client-".concat(version).concat(".jar"));
        return updateInfo;
    }

    private String simpleVersionGenerator() {
     VersionGenerator versionGenerator = new VersionGenerator(majorVersion, minorVersion, patch);
     versionGenerator.incrementMajor();
     versionGenerator.incrementMinor();
     versionGenerator.incrementPatch();
     return versionGenerator.getVersion();
    }

}