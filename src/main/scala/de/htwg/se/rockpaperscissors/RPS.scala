package de.htwg.se.rockpaperscissors
import de.htwg.se.rockpaperscissors.model.{Deck, Player}

object RPS {
    def main(args: Array[String]): Unit = {
      val player = Player("Your Name")
      val deck = new Deck()
      println("Hello, " + player.name)
      player.hand.takeCard(deck)
    }
}
