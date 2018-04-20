/**
 * Instance Methods
 * ================
 * Both of these methods should be callable by subclasses of Vehicle
 * #1 breakThisVehicle - change isBroken to true
 * #2 getBrokenStatus - return the value of isBroken
 */
public abstract class Vehicle
{
    private double maxSpeed;
    private double currentSpeed;
    private boolean isBroken;
    private int id;

    public Vehicle(int id, double maxSpeed){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0;
        this.isBroken = false;
        this.id = id;
    }
    
    public void breakThisVehicle () {
        this.isBroken = true;
    }
    
    public boolean getBrokenStatus () {
        return this.isBroken;
    }

    public final double getMaxSpeed(){
        return maxSpeed;
    }

    public final double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public final void setCurrentSpeed(double speed){
        currentSpeed = speed;
    }
    
    public abstract void setCurrentSpeedRestricted(double speed);

    public String toString(){
        return "Vehicle" + id + "-> Current Speed: " + currentSpeed + "Broken: " + isBroken;
    }

}