import scalaj.http._
import io.circe._, io.circe.parser._

import Model.{GitHubProject, GitHubUser}

package Infra.Client {
  class GitHubClient {
    def getUserProjects(user: GitHubUser): List[GitHubProject] = {
      val response: HttpResponse[String] = Http(s"https://api.github.com/users/${user.login}/repos?type=all").param("q","monkeys").asString
      val parseResult = parse(response.body)

      val result = parseResult.b.a.map(x -> List())

      return List()
    }
  }
}

