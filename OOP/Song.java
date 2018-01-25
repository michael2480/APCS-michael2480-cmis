
public class Song
{
    private String name;
    private String lyrics;
    private boolean isExplicit;
    
    public Song () {
        this.name = "unknown title";
        this.lyrics = "no lyrics";
        this.isExplicit = false;
    }
    
    public Song (String name, String lyrics, boolean isExplicit) {
        this.name = name;
        this.lyrics = lyrics;
        this.isExplicit = isExplicit;
    }
    
    public String toString () {
        String printArr = "";
        printArr = "Name: " + this.name;
        printArr += "\nLyrics: " + this.lyrics;
        printArr += "\nExplicit: " + this.isExplicit;
        return printArr;
    }
}
