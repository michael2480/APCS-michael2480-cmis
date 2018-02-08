
public class Pen
{
    private double ink;
    private String brand;
    private String color;
    private int price;

    private double fullInk = 25.2;

    public Pen() {
        this.ink = 25.2;
        this.brand = "Sharpie";
        this.color = "Black";
        this.price = 35;
    }
    
    public double getInk () {
        return this.ink;
    }

    public void setInk (double ink) {
        this.ink = ink;
    }

    public String getBrand () {
        return this.color;
    }

    public void setBrand (String color) {
        this.color = color;
    }

    public String getColor () {
        return this.color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getPrice (boolean prettyFormat) {
        String price = Integer.toString(this.price);
        return prettyFormat ? "$" + price + ".00" : price;
    }

    public void setPrice (int proposedPrice) {
        this.price = proposedPrice < 1 ? 1 : proposedPrice;
    }
    
    public void refillInk () {
        setInk(this.fullInk);
    }
    
    public void write(String toWrite) {
        if (getInk() >= toWrite.length()) {
            System.out.println(toWrite);
            setInk(getInk() - toWrite.length());
        }
        else {
            System.out.println("-=NOT ENOUGH INK=-");
        }
    }
    
    public String toString () {
        return "You possess a " + getColor() + " " + Double.toString(getInk()) + "ml pen made by " + getBrand() + " which is worth around " + getPrice(true);
    }
}
