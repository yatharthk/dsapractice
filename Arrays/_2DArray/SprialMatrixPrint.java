package dsaPractice.Arrays._2DArray;

public class SprialMatrixPrint {
    public static void main(String[] args) {
//        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] input = new int[][]{{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12}};
        printSpiral(input, 3, 4);
    }

    private static void printSpiral(int[][] input, int nRows, int mCols) {
        int startingRowIndex = 0;
        int endingRowIndex = nRows - 1;
        int startingColIndex = 0;
        int endingColIndex = mCols - 1;
        int count = 0;
        int totalCount = nRows * mCols;

        while (count < totalCount) {

            //print 1st row
            for (int i = startingColIndex; i <=endingColIndex && count < totalCount; i++) {
                System.out.println(input[startingRowIndex][i]);
                count++;
            }
            startingRowIndex++;

            //print last col

            for (int i = startingRowIndex; i <=endingRowIndex && count < totalCount; i++) {
                System.out.println(input[i][endingColIndex]);
                count++;
            }
            endingColIndex--;

            //print last row
            for (int i = endingColIndex; i >=startingColIndex && count < totalCount; i--) {
                System.out.println(input[endingRowIndex][i]);
                count++;
            }
            endingRowIndex--;

            //print first col
            for (int i = endingRowIndex; i >= startingRowIndex && count < totalCount; i--) {
                System.out.println(input[i][startingColIndex]);
                count++;
            }
            startingColIndex++;

        }
    }
}
