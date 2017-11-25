
public class RecursiveMethods
{
    public static void main (String args[]) {
        System.out.println(grid(15,3,"H"));
    }

    public static int pow(int a, int n) {
        int result = 0;
        if (n > 0) {
            result = result * pow(a, n - 1);
        }
        else {
            return 1;
        }

        return result;
    }

    public static String grid(int w, int h, String symbol) {
        if (h > 0) {
            return row(w, symbol) + grid(w, h - 1, symbol);
        }
        else {
            return ("");
        }
    }

    public static String row(int l, String symbol) {
        if (l > 0) {
            return symbol + row(l-1, symbol);
        }
        else {
            return "\n";
        }
    }

    public static int mul(int a, int b) {
        if (b > 0) {
            return a + mul(a,b-1);
        }
        else {
            return 0;
        } 
    }

    public static String chopString (String s) {
        return s.substring(0,s.length()-1);
    }
    
    public static int bin2Dec(String s) {
        if (!s.equals("")) {
            return s.charAt(s.length()-1) - 48 + 2*bin2Dec(chopString(s));
        }
        else {
            return 0;
        }
    }
    
    //  1  2  3  4  5  6   7   8   9  10  
    //  1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    
    // fib(9) = fib(8) + fib(7)
    //        = fib(7)+fib(6) + fib(6)+fib(5) 
    //        = fib(6)+fib(5)+fib(5)+fib(4) + fib(5)+fib(4)+fib(4)+fib(3)
    //        = fib(5)+fib(4)+fib(4)+fib(3)+fib(4)+fib(3)+fib(3)+fib(2) + fib(4)+fib(3)+fib(3)+1+fib(3)+1+1+1
    //        = fib(4)+fib(3)+fib(3)+1+fib(3)+1+1+1+fib(3)+1+1+1 + fib(4)+fib(3)+fib(3)+1+fib(3)+1+1+1
    
    public static int fib(int n) {
        if (n < 3) {
            return 1;
        }
        else {
            return fib(n-1) + fib (n-2);
        }
    }
}
