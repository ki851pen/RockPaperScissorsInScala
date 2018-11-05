package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

case class Hand (cards:ListBuffer[Card]){
  def size : Int = cards.length
  def takeCard(deck : Deck) : Card = {
    val c = deck.divideCard
    cards.+=:(c);
    return c;
  }
  def give : Card = {
    val a = scala.io.StdIn.readInt()
    this.cards.remove(a)
  }
}

