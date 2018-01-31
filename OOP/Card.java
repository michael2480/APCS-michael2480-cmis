import java.util.Random;
public class Card
{
    private String suit;
    private String value;

    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card () {
        suit = suits[(int)(Math.random() * suits.length)];
        value = values[(int)(Math.random() * values.length)];
    }

    public Card (String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    public String GetValue () {
        return this.value;
    }

    public String toString() {

        return "The " + value + " of " + suit;
    }

}
