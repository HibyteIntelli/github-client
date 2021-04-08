package ro.hibyte.gitclient

import org.dxworks.githubminer.service.repository.branches.GithubBranchService

fun main() {
    val githubBranchService: GithubBranchService =
        GithubBranchService("apache", "kafka", githubTokens = listOf("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"))

    val branches = githubBranchService.allBranches

    branches
        .filterNotNull()
        .forEach { br -> println(br.name) }
}


