package dsaPractice.GFG.BitWise;

public class FindFirstDifferentBitFromRight {

    public static void main(String[] args) {
        System.out.println(findFirstDiffBit(11,9));
    }

    private static int findFirstDiffBit(int m, int n) {
        int pos=0;
        int xor=m^n;
        while((m^n)>0) {

            if (xor != 1) {
                pos++;
                xor = xor >> 1;
            }
            return pos+1;
        }
         return -1;
        }
    }
