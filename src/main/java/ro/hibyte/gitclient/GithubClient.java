package ro.hibyte.gitclient;

import java.util.List;

public class GithubClient {
    public List<String> getAllBranchesFor(String project) {
        return List.of("branch1", "branch2", "branch3");
    }
}
