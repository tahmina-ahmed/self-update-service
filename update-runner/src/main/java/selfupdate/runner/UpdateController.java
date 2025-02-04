package selfupdate.runner;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller responsible for handling update requests and interacting with the UpdateRunnerService.
 */
@RestController
@RequiredArgsConstructor
public class UpdateController {

    private final UpdateRunnerService updateRunnerService = new UpdateRunnerService();

    /**
     * Handles GET requests to "/update" endpoint.
     * Initiates the check for updates operation in UpdateRunnerService.
     *
     * @return A message indicating that the client application has been updated.
     */
    @GetMapping("/update")
    public String getUpdateInfo() {
        System.out.println("Running update");
        updateRunnerService.checkForUpdates(); // Check for updates and start the updated client if available
        return "Client Updated!";
    }
}