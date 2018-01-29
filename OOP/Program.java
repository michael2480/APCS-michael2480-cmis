import javax.swing.JOptionPane;

public class Program
{
    public static void main(String[] args) {
        Song song1 = new Song();
        System.out.println(song1.toString());
        
        Song song2 = new Song("Bagels", "bagel bagel sprinkle bagel!!", false);
        System.out.println(song2.toString());
        
        String hour = JOptionPane.showInputDialog("Hour: \n");
        String minute = JOptionPane.showInputDialog("Minute: \n");
        String second = JOptionPane.showInputDialog("Second: \n");
        
        
        
    }
}
