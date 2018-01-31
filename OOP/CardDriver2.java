import java.util.Arrays;
public class CardDriver2
{
    
    Card[] p1 = new Card[2];
    Card[] p2 = new Card[2];
    Card[] p3 = new Card[2];
    Card[] p4 = new Card[2];
    Card[] p5 = new Card[2];
    Card[] dealer = new Card[2];

    
    public static int handCounter (Card[] cards) {
        int sum = 0;
        for (int i = 0 ; i < 2 ; i++) {
            
        }
    
    }
    
    public static int intCardCounter(Card card) {
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

