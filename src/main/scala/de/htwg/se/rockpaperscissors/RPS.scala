package de.htwg.se.rockpaperscissors
import de.htwg.se.rockpaperscissors.model.Player

object RPS {
    def main(args: Array[String]): Unit = {
      val player = Player("Your Name")
      println("Hello, " + player.name)
    }
}
