package de.htwg.se.rockpaperscissors
import de.htwg.se.rockpaperscissors.model.{Card, Deck, Player}

import scala.collection.mutable.ListBuffer

object RPS {
    def main(args: Array[String]): Unit = {
      val p1 = Player("p1", new ListBuffer[Card])
      val p2 = Player("p2", new ListBuffer[Card])
      val deck = new Deck()
      println("Hello, " + p1.name)
      for (i <- 0 to 4) {
        p1.takeCard(deck)
        p2.takeCard(deck)
      }
      p1.cardsOnHand
      println("---")
      p2.cardsOnHand
      p1.play
    }
}
