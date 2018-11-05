package de.htwg.se.rockpaperscissors.model

import org.scalatest.{Matchers, WordSpec}

import scala.collection.mutable.ListBuffer

class handSpec extends WordSpec with Matchers{
  "A Hand" when {
    "new" should {
      val newhand = Hand(ListBuffer())
      "have 0 card" in {
        newhand.size should be(0)
      }
    }
    val oldhand = Hand(ListBuffer(Card("symbol")))
    ""in{oldhand.cards should contain(Card("symbol"))}
  }
}
