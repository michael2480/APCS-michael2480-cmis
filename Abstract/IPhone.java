
public class IPhone extends MyDevice
{
    private String model;
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String s) {
        this.model = s;
    }
    
    public IPhone (String brand, double cost, String model) {
        super(brand, cost);
        this.model = model;
    }

}
