public class binaryTest
{
    public static void main(String[] args){
        byte aByte = (byte) 0b01111111;
        short aShort = (short) 0b0111111111111111;
        int anInteger = 0b01111111111111111111111111111111;
        long aLong = 0b0111111111111111111111111111111111111111111111111111111111111111L;
        
        System.out.println(aByte + " " + aShort + " "+ anInteger + " " + aLong);
    }
}