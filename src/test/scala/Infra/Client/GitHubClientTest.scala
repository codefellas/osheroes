import Model.GitHubUser
import org.scalatest._

import Infra.Client._


class GitHubClientTest extends FlatSpec with Matchers {
  it should "read GitHub user projects" in {
    val gitHubClient = new GitHubClient()
    val projects = gitHubClient.getUserProjects(new GitHubUser("leonardiwagner"))
    projects.length should be (1)
  }
}