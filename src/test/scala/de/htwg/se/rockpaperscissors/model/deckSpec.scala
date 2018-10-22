package de.htwg.se.rockpaperscissors.model

import org.scalatest._

class deckSpec extends WordSpec with Matchers {
  "A Deck" when {
    "new" should {
      val card1 = card("rock")
      val card2 = card("paper")
      val card3 = card("scissors")
      val card4 = card("Joker")
      val newdeck = deck(Array(card1, card1, card1,
        card2, card2, card2, card3, card3, card3, card4))
      "have 10 cards" in {newdeck.size should be(10)}
      "have one Joker" in {newdeck.cards should contain(card4)}
      "not empty" in {newdeck.isEmpty should be(false)}
    }
    "empty" should {
      val olddeck = deck(Array())
      "really be empty" in {olddeck.isEmpty should be(true)}
    }
  }
}

