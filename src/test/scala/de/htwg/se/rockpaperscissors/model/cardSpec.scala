package de.htwg.se.rockpaperscissors.model

import org.scalatest.{Matchers, WordSpec}

class cardSpec  extends WordSpec with Matchers {
  "A Card" should {
    val card1 = card("symbol")
    "have a symbol"  in {
      card1.symbol should be("symbol")
    }
    "have a nice String representation" in {
      card1.toString should be("symbol")
    }
  }
}
