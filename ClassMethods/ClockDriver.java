
public class ClockDriver
{

    public static void main (String[] args) {
        Clock clock1 = new Clock();
        System.out.println(clock1.toString());
        clock1.setTime(3,20,0);
        System.out.println(clock1.toString());
        clock1.convertDaylightSaving(1);
        System.out.println(clock1.toString());
    }
}
