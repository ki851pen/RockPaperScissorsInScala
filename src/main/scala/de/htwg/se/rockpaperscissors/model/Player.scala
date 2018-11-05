package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer

case class Player(name: String){
  override def toString:String = name
  val hand = Hand(new ListBuffer[Card])
  def cardsOnHand: Unit = {
    for (card <- hand.cards) println(card)
  }
}
