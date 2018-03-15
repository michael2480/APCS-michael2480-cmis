
public class Screen
{
    public Screen() {
    }
    public String print (String in) {
        switch (in) {
            case "Start":
                return "Hi!";
            default:
                throw new IllegalArgumentException("INVALID INPUT FOR PRINT METHOD");
        }
    }
}
