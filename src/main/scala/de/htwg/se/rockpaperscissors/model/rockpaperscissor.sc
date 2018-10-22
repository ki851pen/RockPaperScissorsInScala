import scala.collection.mutable.ListBuffer

val win = true
case class card (val symbol:String)

def card1 = card("rock")
def card2 = card("paper")
def card3 = card("scissors")
def card4 = card("Joker")
card2.symbol

case class Deck(cards: ListBuffer[card])

val deck: Deck = new Deck(ListBuffer(card1, card2, card3, card1, card2))
deck.cards.length
deck.cards.remove(0);
deck
deck.cards -= (card2, card2)
deck
case class Hand(cards: Vector[card])

val r = scala.util.Random
r.nextInt(10)



