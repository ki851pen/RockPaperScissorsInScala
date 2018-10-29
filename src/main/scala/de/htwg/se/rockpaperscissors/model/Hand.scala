package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer

case class Hand (cards:ListBuffer[Card]){
  def size : Int = cards.length
  def takeCard(deck : Deck) : Card = {
    val c = deck.divideCard
    cards.+=:(c);
    return c;
  }
}

