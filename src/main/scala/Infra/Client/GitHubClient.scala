import scalaj.http._
import net.liftweb.json.DefaultFormats
import net.liftweb.json._

import Model._

package Infra.Client {

  class GitHubClient {
    implicit val formats = DefaultFormats

    def getUserProjects(user: GitHubUser): List[GitHubProject] = {
      val response: HttpResponse[String] = Http(s"https://api.github.com/users/${user.login}/repos?type=all").param("q","monkeys").asString
      val parsedJson = parse(response.body)

      val result = parsedJson.children.map(project => project.extract[GitHubProject])
      return result
    }
  }
}

