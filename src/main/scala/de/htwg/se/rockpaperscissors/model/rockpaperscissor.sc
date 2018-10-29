import scala.collection.mutable.ListBuffer

val win = true
case class card (symbol:String)

def ro = card("rock")
def pa = card("paper")
def sc = card("scissors")
def jo = card("Joker")
pa.symbol

case class Deck(cards: ListBuffer[card])

val deck: Deck = Deck(ListBuffer(ro, pa, sc, ro, jo))
deck.cards.length
deck.cards.remove(0)
deck.cards.length
deck
deck.cards -= (ro, ro)
deck
case class Hand(cards: Vector[card])

val r = scala.util.Random
r.nextInt(10)



