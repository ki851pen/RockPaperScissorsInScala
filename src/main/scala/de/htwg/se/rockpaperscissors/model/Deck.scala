package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer

case class Deck(cards: ListBuffer[Card]){
  val ro = Card("rock")
  val pa = Card("paper")
  val sc = Card("scissors")
  val jo = Card("joker")
  //val defaultDeck = ListBuffer(ro, ro, ro, pa, pa, pa, sc, sc, sc, jo)
  def size = this.cards.length
  def isEmpty: Boolean = size == 0
  def this () {
    this(ListBuffer(Card("rock"), Card("rock"), Card("rock"), Card("paper"), Card("paper"), Card("paper"),
    Card("scissors"), Card("scissors"), Card("scissors"), Card("joker")))
  }
  def divideCard: Card = {
    val r = scala.util.Random
    val randomCard: Int = r.nextInt(size)
    this.cards.remove(randomCard)
  }
}
