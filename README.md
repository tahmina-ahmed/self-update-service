Project Structure
-----------------

Each project is structured as follows:

### update-server

*   **Purpose**: Hosts update information and JAR files.
*   **Endpoints**: Provides version information and download links to client applications.
*   **Default Port**: 8081

### update-runner

*   **Purpose**: Monitors for updates and manages the client application lifecycle.
*   **Functionality**: Checks for updates from the update-server, downloads new versions of client-app, replaces the old version, and restarts the client application.
*   **Default Port**: 8082

### client-app

*   **Purpose**: A sample client application that needs to stay updated.
*   **Functionality**: Checks for updates from the update-server.
*   **Default Port**: 8083


Build and Run Instructions
--------------------------

### Build the Projects

Navigate into each project directory and build them using Maven:

```bash
cd ../update-server
mvn clean install

cd ../client-app
mvn clean install

cd ../update-runner
mvn clean install
```
### Start the Applications

Start each Spring Boot application in separate terminal windows:

```bash
java -jar <PATH_SERVER_JAR>/update-server.jar
java -jar <PATH_CLIENT_JAR>/client-app.jar
java -jar <PATH_RUNNER_JAR>/update-runner.jar
```


### Access the Client Application

*   Open a web browser and navigate to [http://localhost:8083/](http://localhost:8083/) to see the client application's greeting message.

### Trigger Update

To trigger an update manually, make a GET request to [http://localhost:8082/update](http://localhost:8082/update) using tools like cURL or a web browser. This will check for updates, download, and run the new version of `client-app`.

* * *
