public class WDID2
{
    public static void main(String[] args){
        int x = 1;
        int y = 10;
        while ( y > x ){
            for( int i = x; i < 10; i+=(y/2)){
                x+=2;
            }
            y--;
        }     
        System.out.println(x +" "+y);                
    }
}