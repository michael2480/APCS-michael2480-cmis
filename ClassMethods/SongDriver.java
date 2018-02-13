
public class SongDriver
{
    public static void main (String[] args) {
        Song bad = new Song("Baby", "Babybabybaby ooh", "Justin Beiber", 216, 2008);
        Song unnamed = new Song();
        
        System.out.println(bad.toString());
        System.out.println(unnamed.toString());
        
        System.out.println(bad.getYearReleased());
        bad.setYearReleased(2009);
        
        System.out.println(bad.toString());
    }
}
