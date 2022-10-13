package dsaPractice.GFG.BitWise;

public class CountSetBits {
//    Ip: n =4
//   Op: count the set bits in this number

    public static void main(String[] args) {
        int n = 5;
//        System.out.println(countSetbitsNaive(n));
        System.out.println(countSetBitsUsingKerningamsApproach(n));
    }

//    0100 set bits as 1
//    Approach 1: Naive

    static int countSetbitsNaive(int n) {
        int res = 0;
        while (n > 0) {
            if (n % 2 == 1) res++;
            n = n / 2;
        }

        return res;
    }

    //Approach 2: Kerningams Approach


    static int countSetBitsUsingKerningamsApproach(int n) {
        if (n == 0) return 0;
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        return res;
    }

    //Approach 3: Table Set Approach:
    //Pre condition: table is already set up  before processing.
    static int LookUpTableApproach(int n) {
        initialize();
//        count(){
//    }
        return 0;
    }

    static int[] initialize() {
        int table[] = new int[256];
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
        return table;
    }
}




