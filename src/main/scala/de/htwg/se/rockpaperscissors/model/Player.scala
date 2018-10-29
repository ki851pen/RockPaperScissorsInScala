package de.htwg.se.rockpaperscissors.model

case class Player(name: String){
  override def toString:String = name
  val hand : Hand
  def cardsOnHand: Unit = {
    for (card <- hand.cards) println(card)
  }
}
