
import java.util.*;

public class Flashlight {
    private boolean isOn = false;

    private String lightColor = "white";

    private int intensity = 2;

    /***
     * Methods for you to implement
     * toggle: changes the state from on to off and vice versa
     * changeColor(String newColor): change the lightColor but only to one of the validColors 
     * incIntensity: increase the intensity by one up to a maximum of 5
     * decIntensity: decrease the intensity by one down to a minimum of 0
     * getIntensityDescription: retrieve a narrative description of the intensity level
     */
    /* Sample output 
    Test toggle
    ===========
    The flashlight is off.
    There is a medium white light emanating from the flashlight.
    The flashlight is off.
    Test changeColor
    ================
    There is a medium white light emanating from the flashlight.
    There is a medium red light emanating from the flashlight.
    There is a medium blue light emanating from the flashlight.
    There is a medium yellow light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    Test getIntensity, decIntensity, incIntensity
    =============================================
    medium
    dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    dim
    medium
    bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
     */

    public void toggle() {
        this.isOn = !this.isOn;
    }

    public void changeColor(String color) {
        String[] validColors = {"white", "red", "blue", "yellow"};
        if (Arrays.asList(validColors).contains(color)) {
            this.lightColor = color;
        }
    }

    public String toString(){
        String out = "";
        if (isOn) {
            out += "There is a ";
            out += getIntensityDescription() + " ";
            out += lightColor + " light";
            out += " emanating from the flashlight.";
        }
        else {
            out = "The flashlight is off.";
        }
        return out;
    }       

    public void incIntensity() {
        if (this.intensity != 4) {
            this.intensity += 1;
        }
    }
    
    public void decIntensity() {
        if (this.intensity != 0) {
            this.intensity -= 1;
        }
    }
    
    public String getIntensityDescription() {
        return new String[]{"extremely dim", "dim", "medium", "bright", "retina searingly bright"}[this.intensity];
    }
    
    public static void main(String[] args) {
        Flashlight fl = new Flashlight();
        System.out.println(fl);

        System.out.println("\nTest toggle\n===========");
        System.out.println(fl);
        fl.toggle();
        System.out.println(fl);
        fl.toggle();
        System.out.println(fl);
        fl.toggle();
        System.out.println("\nTest changeColor\n================");
        
        fl.changeColor("red");
        System.out.println(fl);
        fl.changeColor("blue");
        System.out.println(fl);
        fl.changeColor("yellow");
        System.out.println(fl);
        fl.changeColor("white");
        System.out.println(fl);
        fl.changeColor("green");
        System.out.println(fl);
        fl.changeColor("orange");
        System.out.println(fl);
        System.out.println("\nTest getIntensity, decIntensity, incIntensity\n=============================================");
        
        System.out.println(fl.getIntensityDescription());
        fl.decIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        
         
    }
}