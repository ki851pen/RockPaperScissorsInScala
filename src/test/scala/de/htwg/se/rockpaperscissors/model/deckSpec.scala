package de.htwg.se.rockpaperscissors.model

import org.scalatest._

class deckSpec extends WordSpec with Matchers {
  "A Deck" when {
    "new" should {
      val newdeck = deck(Array(card("rock")))
      "10 cards" in {newdeck.size == 10}
    }
    "empty" should {
      val olddeck = deck(Array(card("rock")))
      "really be empty" in {olddeck.isEmpty}
    }
  }
}

