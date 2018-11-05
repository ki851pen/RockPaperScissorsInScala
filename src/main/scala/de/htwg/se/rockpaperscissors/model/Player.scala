package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer

case class Player(name: String, cards:ListBuffer[Card]){
  override def toString:String = name
  def size : Int = cards.length
  def takeCard(deck : Deck) : Card = {
    val c = deck.divideCard
    cards.+=:(c);
    return c;
  }
  def play : Card = {
    val a = scala.io.StdIn.readInt()
    println(name + " played : " + cards(a) )
    this.cards.remove(a)
  }
  def cardsOnHand: Unit = {
    for (card <- this.cards) println(card)
  }
}
