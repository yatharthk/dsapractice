package dsaPractice.Arrays;

public class findDuplicatingNumber {
    // given array with number=s 1 to n-1. FInd the duplicating number.
    //condition given is 1,N-1 is already present at-least once.

    public static void main(String[] args) {
        int arr1[] = {4,2,1,3,1};
        int arr2[] = {5,1,2,3,4,2};
        int arr3[] = {8,7,2,5,4,7,1,3,6};
        System.out.println(findDuplicateNumber(arr3));
    }

    private static int findDuplicateNumber(int[] arr) {
        int xor= 0 ;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        //calculate the xor for all the numbers present in arr.
//        so xor the numbers form i to n-1; since xor of n and n =0 and the extra one number
//        will be left out after xor-ing.
        int xor2= 0;
        for (int i = 1; i < arr.length; i++) {
            xor = xor^i;
        }
        return xor^xor2;



    }
}
