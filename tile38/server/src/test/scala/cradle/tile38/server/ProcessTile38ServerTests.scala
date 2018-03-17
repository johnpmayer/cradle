
package cradle.tile38.server

import java.nio.charset.StandardCharsets

import com.redis.RedisClient
import org.scalatest._

class ProcessTile38ServerTests extends FlatSpec with Matchers {

  "ProcessTile38Server" should "Be accessible from redis client when launched" in {

    // TODO: implement Closeable for ProcessTile38Server
    val server = new ProcessTile38Server

    try {
      server.start()

      val client = new RedisClient("localhost", 9851)

      val responseMap: Map[String, String] = client.send("server") {

        val elems: Seq[String] = for {
          resp_array <- client.receive(client.multiBulkReply).toSeq
          resp_elem <- resp_array
          elem <- resp_elem.toSeq
        } yield {
          new String(elem, StandardCharsets.UTF_8)
        }

        elems.sliding(2).collect { case List(k,v) => k -> v }.toMap

      }

      responseMap.get("read_only") shouldEqual Some("false")

    } finally {
      server.stop()
    }

  }

}