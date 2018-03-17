
package cradle.tile38.server

import org.zeroturnaround.exec.ProcessExecutor
import org.zeroturnaround.exec.stop.DestroyProcessStopper

class ProcessTile38Server {

  private final val Tile38ExecutableName = "tile38-server"

  private final val stopper = new DestroyProcessStopper


  private final val executor = {
    val executor = new ProcessExecutor()
    executor.command(Tile38ExecutableName)
    executor.destroyOnExit()
    executor.stopper(stopper)
  }

  private var process: Process = null

  def start(): Unit = {
    val sp = executor.start()
    process = sp.getProcess
  }

  def stop(): Unit = {
    stopper.stop(process)
  }

}