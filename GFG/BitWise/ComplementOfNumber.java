package dsaPractice.GFG.BitWise;

public class ComplementOfNumber {
    public static void main(String[] args) {
        complementOfNumber(-6);
    }

    private static void complementOfNumber(int n) {
        int m = n;
        int mask =0;

        //
        while (m!=0){
            mask = (mask<<1)|1;
            m=m>>1;
        }
        System.out.println(~n&mask);

    }
}
