package dsaPractice.GFG.BitWise;

public class TwoOddOccurring {

    public static void main(String[] args) {
        int[] arr = {3,4,3,4,8,4,4,6,7,7};
        int res1 = 0, res2 = 0, XOR = 0;
        for (int i : arr) {
            XOR = XOR ^ i;
//            5^6     0101 ^ 0110 = 0011
//            (xor -1) -> 0010
//            ~(xor-1)->1101

        }
        int lastBit=XOR & ~(XOR-1);
//        0011 &
//        1101

//     = 0001

        for (int x:arr) {
            if((x & lastBit) ==0)
                res1=res1^x;
            else res2^=x;
        }
        System.out.println(res1 + " " + res2);
    }
}
