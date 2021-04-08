package ro.hibyte.gitclient

import org.dxworks.githubminer.service.repository.branches.GithubBranchService
import kotlin.io.path.ExperimentalPathApi

@ExperimentalPathApi
fun main(args: Array<String>) {

    val githubBranchService: GithubBranchService =
        GithubBranchService("apache", "kafka", githubTokens = args.toList())

    val branches = githubBranchService.allBranches

    branches
        .filterNotNull()
        .forEach { br -> println(br.name) }
}


