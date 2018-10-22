package de.htwg.se.rockpaperscissors.model

import org.scalatest.{Matchers, WordSpec}

class handSpec extends WordSpec with Matchers{
  "A Hand" when {
    "new" should {
      val newhand = hand(Array())
      "have 0 card" in {
        newhand.size should be(0)
      }
    }
    val oldhand = hand(Array(card("symbol")))
    ""in{oldhand.cards should contain(card("symbol"))}
  }
}
