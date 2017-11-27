
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

    /*
     * 2^0 = 1
     * 2^1 = 2 
     * 2^2 = 4
     * 2^3 = 8 
     * 2^4 = 16
     * 2^5 = 32 
     *
     * 1  - 2^0 - 1
     * 2  - 2^1 - 10
     * 3  - 2^1 + 2^0 - 11
     * 4  - 2^2 - 100
     * 5  - 2^2 + 2^0 - 101
     * 6  - 2^2 + 2^1 - 110
     * 7  - 2^2 + 2^1 + 2^0 - 111
     * 8  - 2^3 - 1000
     * 9  - 1001
     * 10 - 1010
     * 11 - 1011
     * 12 - 1100
     * 13 - 1101
     * 14 - 1110 4
     * 15 - 1111
     * 16 - 10000 5
     * 
     * 2^3 + 2^1 + 2^0
     * 
     * 1011
     * 011
     * 11
     * 1
     * 
     * 
     * 
     */

    public static int binToDec (String b) {
        int base = b.length()-1;
        if (b.length() == 0) {
            return 0;
        }
        else {
            if (b.charAt(0) == '1') {
                return (int)Math.pow(2, base) + binToDec(b.substring(1, b.length()));  
            }
            else {
                return binToDec(b.substring(1, b.length()));
            }
        }
    }

    public static int binToDec2 (String b) {
        int b2 = Integer.parseInt(b);
        int base = 7;
        while (Math.pow(10,base-1) > b2) {
            base -= 1;
        }
        System.out.println(Integer.toString(b2) + " " + base);
        return doBinToDec(Integer.toString(b2), base, base, 0);
    }

    public static int doBinToDec (String b, int baseinit, int base, int pos) {
        // 1110, 4, 4, 0
        if (pos < baseinit) {
            System.out.println(b  + " " + (base-1) + " [" + pos + "]  =" + b.charAt(pos));
            if (Character.getNumericValue(b.charAt(pos)) == 1) {
                System.out.println(Math.pow(2, base-1));
                return (int)Math.pow(2, base-1) + doBinToDec(b, baseinit, base-1, pos+1);
            }
            else {
                return 0 + doBinToDec(b, baseinit, base-1, pos+1);
            }
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
