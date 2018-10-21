package de.htwg.se.rockpaperscissors.model

case class hand (cards:Array[card]){
  def size:Int = cards.length
}

