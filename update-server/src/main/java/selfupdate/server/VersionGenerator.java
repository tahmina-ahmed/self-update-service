package selfupdate.server;


public class VersionGenerator {

        private int major;
        private int minor;
        private int patch;

        public VersionGenerator(int major, int minor, int patch) {
            this.major = major;
            this.minor = minor;
            this.patch = patch;
        }

        public String getVersion() {
            return major + "." + minor + "." + patch;
        }

        public void incrementMajor() {
            major++;
            minor = 0;
            patch = 0;
        }

        public void incrementMinor() {
            minor++;
            patch = 0;
        }

        public void incrementPatch() {
            patch++;
        }
}
