package de.htwg.se.rockpaperscissors
import de.htwg.se.rockpaperscissors.model.{Deck, Player}

object RPS {
    def main(args: Array[String]): Unit = {
      val p1 = Player("p1")
      val p2 = Player("p1")
      val deck = new Deck()
      println("Hello, " + p1.name)
      for (i <- 0 to 4) {
        p1.hand.takeCard(deck)
        p2.hand.takeCard(deck)
      }
      p1.cardsOnHand
      println("---")
      p2.cardsOnHand
    }
}
