package de.htwg.se.rockpaperscissors.model

import org.scalatest._

import scala.collection.mutable.ListBuffer

class deckSpec extends WordSpec with Matchers {
  "A Deck" when {
    "new" should {

      val Deck : deck = deck(ListBuffer())
      val newdeck = Deck.defaultDeck
      "have 10 cards" in {newdeck.size should be(10)}
      "have one Joker" in {newdeck.cards should contain(card("joker"))}
      "not empty" in {newdeck.isEmpty should be(false)}
    }
    "empty" should {
      val olddeck = deck(ListBuffer())
      "really be empty" in {olddeck.isEmpty should be(true)}
    }
  }
}

