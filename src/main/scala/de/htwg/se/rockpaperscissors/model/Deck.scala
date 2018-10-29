package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer

case class Deck(cards: ListBuffer[Card]){
  val ro = Card("rock")
  val pa = Card("papier")
  val sc = Card("scissors")
  val jo = Card("joker")
  val defaultDeck = ListBuffer(ro, ro, ro, pa, pa, pa, sc, sc, sc, jo)
  var size = this.cards.length
  def isEmpty: Boolean = size == 0
  def this () {
    this(defaultDeck)
  }
  val r = scala.util.Random
  def randomCard: Int = r.nextInt(size)
  def divideCard: Card = this.cards.remove(randomCard)
}
