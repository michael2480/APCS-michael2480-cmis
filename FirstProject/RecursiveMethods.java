
public class RecursiveMethods
{
    public static void main (String args[]) {
        System.out.println(grid(15,3,"H"));
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

    //  2 3      1 3     0 3   2  2      1  2   0 2   2 1      1 1    0 1
    // symbol + symbol + \n + symbol + symbol + \n + symbol + symbol + \n
    /*
     * x = 2 ; h = 3 ; sym = %
     * 
     * %%
     * %%
     * %%
     * 
     */
}
