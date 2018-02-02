import java.util.Arrays;
public class CardDriver2
{

    Card[] p1 = new Card[2];
    Card[] p2 = new Card[2];
    Card[] p3 = new Card[2];
    Card[] p4 = new Card[2];
    Card[] p5 = new Card[2];
    Card[] dealer = new Card[2];

    String winning = "Dealer";
    int sum = 0;

    public void findWinner() {
        sum = CardDriver2.handCounter(dealer);
        if (CardDriver2.handCounter(p1) > sum) {
            winning = "Player 1";
            sum = CardDriver2.handCounter(p1);
            if(CardDriver2.handCounter(p2) > sum) {
                winning = "Player 2";
                sum = CardDriver2.handCounter(p2);
                if (CardDriver2.handCounter(p3) > sum) {
                    winning = "Player 3";
                    sum = CardDriver2.handCounter(p3);
                    if(CardDriver2.handCounter(p4) > sum) {
                        winning = "Player 4";
                        sum = CardDriver2.handCounter(p4);
                        if (CardDriver2.handCounter(p5) > sum) {
                            winning = "Player 5";
                            sum = CardDriver2.handCounter(p5);
                        }
                    }
                }
            }
        }
    }

    public static int handCounter (Card[] cards) {
        return CardDriver2.CardCounter(cards[0]) + CardDriver2.CardCounter(cards[1]);

    }

    public static int CardCounter(Card card) {
        String[] royalty = {"J", "Q", "K"} ;
        if (Arrays.asList(royalty).contains(card.GetValue()) || Integer.parseInt(card.GetValue()) == 10) {
            return 10;
        } 
        else if (card.GetValue() == "A") {
            return 11;
        }
        else {
            return Integer.parseInt(card.GetValue());
        }
    }
}

