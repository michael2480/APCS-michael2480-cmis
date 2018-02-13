
public class Song
{
    private String name;
    private String lyrics;
    private String artist;
    private int lengthSecs;
    private int yearReleased;
    
    public Song () {
        this.name = "unknown track";
        this.lyrics = "";
        this.artist = "unknown artist";
        this.lengthSecs = 0;
        this.yearReleased = 0;
    }
    
    public Song (String name, String lyrics, String artist, int length, int year) {
        this.name = name;
        this.lyrics = lyrics;
        this.artist = artist;
        setLength(length);
        setYearReleased(year);
    }
    
    public int getYearReleased () {
        return yearReleased;
    }
    
    public void setLength (int length) {
        if (length > 0) {
            this.lengthSecs = length;
        }
        else {
            this.lengthSecs = 0;
        }
    }
    
    public void setYearReleased (int setYear) {
        if (setYear >= 1700 && setYear <= 2019) {
            this.yearReleased = setYear;
        }
        else {
            this.yearReleased = 0;
        }
    }
    
    public String convertToMinSec () {
        int mins = this.lengthSecs / 60;
        int secs = this.lengthSecs % 60;
        return String.format("The length of the song is: %d minutes and %d seconds", mins, secs);
    }
    
    public String toString() {
        return String.format("File: %s.mp3 | Artist: %s | Length: %s | Year: %d\nLyrics: %s", name, artist, lengthSecs, yearReleased, lyrics);
    }
}
