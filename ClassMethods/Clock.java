
public class Clock
{
    private int hour;
    private int min;
    private int sec;
    
    public Clock () {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }
    
    public void setTime (int hour, int min, int sec) {
        this.hour = (hour < 24 && hour >= 0) ? hour : 0;
        this.min = (min < 60 && min >= 0) ? min : 0;
        this.sec = (sec < 60 && sec >= 0) ? sec : 0;
    }
    
    public void convertDaylightSaving (int hours) {
        if (hours == -1 || hours == 1) {
            this.hour += hours;
            if (this.hour == 24) {
                this.hour = 0;
            }
            else if (this.hour == 23) {
                this.hour = -1;
            }
        }
    }
    
    public int totalSeconds () {
        return this.hour * 12 + this.min * 60 + this.sec;
    }
    
    public String toString () {
        return String.format("The time is %d hours, %d minutes, and %d seconds. Total of %d seconds.", hour, min, sec, totalSeconds());
    }
}
