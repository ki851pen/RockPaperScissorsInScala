package de.htwg.se.rockpaperscissors.model

case class deck(cards: Array[card]){
  def size: Int = cards.length
  def isEmpty: Boolean = size == 0
  //def shuffle
}
