package de.htwg.se.rockpaperscissors.model

import org.scalatest.{Matchers, WordSpec}

import scala.collection.mutable.ListBuffer

class handSpec extends WordSpec with Matchers{
  "A Hand" when {
    "new" should {
      val newhand = hand(ListBuffer())
      "have 0 card" in {
        newhand.size should be(0)
      }
    }
    val oldhand = hand(ListBuffer(card("symbol")))
    ""in{oldhand.cards should contain(card("symbol"))}
  }
}
