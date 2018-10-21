val win = true
case class card (symbol:String)

val card1 = card("rock")
val card2 = card("paper")
val card3 = card("scissors")
val card4 = card("Joker")
card2.symbol

case class Deck(array: Array[card])
val deck = Deck(Array (card1, card1, card1,
  card2, card2, card2, card3, card3, card3, card4))

var i = deck.array.length - 1
while ({i > 0}) {
  val j = Math.floor(Math.random * (i + 1))
  val temp = deck.array(i)
  deck.array(i) = deck.array(j)
  deck.array(j) = temp
  {
    i -= 1; i + 1
  }
}

deck.array(0)
deck.array(7)