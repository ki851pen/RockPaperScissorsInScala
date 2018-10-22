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

deck.array

case class table(card1: card, card2: card)
def isSet:Boolean = card1 != null && card2 != null

val Table = table(card1, card4)
Table.card2
