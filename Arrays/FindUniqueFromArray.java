package dsaPractice.Arrays;

public class FindUniqueFromArray {
    public static void main(String[] args) {
        int arr[] = {2,3,1,6,3,2,6};
        System.out.println(findUniqueInArray(arr));
    }

    private static int findUniqueInArray(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
