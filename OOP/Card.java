
public class Card
{
    private String suit;
    private String value;
    
    public Card () {
        suit = "Spades";
        value = "A";
    }
    
    public Card (String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    public String toString() {
    
        return "The " + value + " of " + suit;
    }
    
}
