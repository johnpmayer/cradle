
package cradle.tile38.server

import com.redis.RedisClient
import org.scalatest._

class ProcessTile38ServerTests extends FlatSpec with Matchers {

  "ProcessTile38Server" should "Be accessible from redis client when launched" in {

    // TODO: use some sort of autocloseable sub-process
    val server = new ProcessTile38Server

    val client = new RedisClient("localhost", 9851)

    // TODO: simple health check (are you ok?, or version?)

    server.stop()

  }

}