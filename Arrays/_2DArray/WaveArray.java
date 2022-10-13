package dsaPractice.Arrays._2DArray;

import java.util.ArrayList;
import java.util.List;

public class WaveArray {

    public static void main(String[] args) {
        int input[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] ans=wavePrint(input,3,3);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        List<Integer> l1 = new ArrayList<>();
        for (int col = 0; col < mCols; col++) {
            if (col % 2 != 0) {
                for (int row = nRows - 1; row > 0; row--) {
                    l1.add(arr[col][row]);
                }
            } else {
                for (int row = 0; row < nRows - 1; row++) {
                    l1.add(arr[col][row]);
                }
            }
        }

        int[] ans = new int[l1.size()];
        for (int k = 0;k<ans.length;k++ ) {
            ans[k]=l1.get(k);
        }
        return ans;
    }
}
