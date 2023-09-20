import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;

public class GitCommitHash {
    // Define a constant for the Git commit hash
    public static final String COMMIT_HASH;

    static {
        try {
            // Replace this with the path to your Git repository
            String repositoryPath = "/path/to/your/git/repository";

            // Open the Git repository
            Repository repository = Git.open(new File(repositoryPath)).getRepository();

            // Get the current HEAD (latest) commit
            ObjectId head = repository.resolve("HEAD");

            // Convert the commit ObjectId to a string (commit hash)
            COMMIT_HASH = head.getName();
        } catch (Exception e) {
            // Handle exceptions here
            e.printStackTrace();
            COMMIT_HASH = "Unknown"; // Default value in case of an error
        }
    }
}
