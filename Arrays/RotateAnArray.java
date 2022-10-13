package dsaPractice.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,7,11};
        int k = 2;
        rotateArray(numArr,k);
    }

    private static void rotateArray(int[] numArr, int k) {
        //for indexes+k  going > n we need to move it inside.
//        use the remainder as value%n gives ans in range(0-value-1) and use it to copy elements.
        int[] temp = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            temp[(i+k)%numArr.length]=numArr[i];
        }
        numArr=temp;

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]+" ");
        }

    }

}
