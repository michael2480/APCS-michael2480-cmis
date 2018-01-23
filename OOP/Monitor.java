
public class Monitor
{
    private String brand;
    private double size;
    private int space;
    
    public Monitor(String brand, double size) {
        this.brand = brand;
        if (size >= 0.0) {
            this.size = size;
        }
    }
    
    public Monitor(String brand, int size) {
        this.brand = brand;
        if (space >= 0) {
            this.space = space;
        }
    }
}
