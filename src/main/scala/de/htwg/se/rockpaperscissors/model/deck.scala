package de.htwg.se.rockpaperscissors.model

import scala.collection.mutable.ListBuffer

case class deck(cards: ListBuffer[card]){
  var size = cards.length
  def isEmpty: Boolean = size == 0
  def defaultDeck : deck = deck(ListBuffer(card("rock"),card("rock"),card("rock"),card("scissors"),
    card("scissors"),card("scissors"),card("paper"),card("paper"),card("paper"),card("joker")))
  val r = scala.util.Random
  def randomCard: Int = r.nextInt(size)
  def devideCard: Unit = this.cards.remove(randomCard)
}
