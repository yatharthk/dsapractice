package dsaPractice.GFG.MathematicsBasicProblems;

public class DecimalToBinary {
    public static void main(String[] args) {
//        convertDecimalToBinary1(5);
//        convertDecimalToBinary2(5);
        System.out.println(negativeDecimalToBinary(-25));
    }

    private static void convertDecimalToBinary1(int n) {
        int ans = 0;
        while (n != 0) {
            int bit = n & 1; //right most bit.
            ans = ans * 10 + bit;
            n = n >> 1;
        }
        System.out.println(ans);
    }

    private static void convertDecimalToBinary2(int n) {
        int ans = 0;
        int i = 0;

        if (n > 0) {
            while (n != 0) {
                int bit = n & 1; //right most bit;
                ans = (int) ((bit * Math.pow(10, i)) + ans); //101 = 10^2*1 + 10^1*0 +10^0 *1-> pow(10,i)*bit
                n = n >> 1;
                i += 1;
            }
            System.out.println(ans);
        }
        if(n<0){
            System.out.println(negativeDecimalToBinary(n));
        }
    }

    // we need to calculate 2s compliment for getting binary for -ve numbers
//    Step 1: convert +ve number to binary
//Step2: calulate 2s complement by making ~of numberv
//    Step3: Add 1 to the answer.
    private static int negativeDecimalToBinary(int n) {
//        n=-6 =(ignore -sign) \
//        positive 6 = 00000000000000000000 110
//        ~n=11111111111111111111111111 001 +1
            int num =n-1;
            int m = ~num;
            int ans =0;
            int i=0;
            while (m!=0)
            {
                int bit = m & 1;
                ans = (int) ((bit * Math.pow(10, i)) + ans);
                m = m >> 1;
                i++;
            }

            int onesComplement = ~ans;
            int twosComplement = onesComplement + 1;
            return twosComplement;

    }
}
