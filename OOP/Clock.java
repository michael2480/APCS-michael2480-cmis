
public class Clock
{
   private int hour; // 24 hour clock
   private int minute;
   private int second;
   
   public Clock () {
       this.hour = 0;
       this.minute = 0;
       this.second = 0;
   }
   
   public Clock (int hour, int minute, int second) {
       this.hour = hour;
       this.minute = minute;
       this.second = second;
   }
   
   public String toString () {
       String returnStr = "The time is ";
       returnStr = returnStr + this.hour + ":" + this.minute + ":" + this.second;
       return returnStr;
   }
}
