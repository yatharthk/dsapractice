package dsaPractice.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {7,9,11,2,6,8};

        System.out.println("Before reversing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int reversedArray[] = reverseArray(arr);
        System.out.println("After reversing ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]+ " ");
        }
        System.out.println();
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start=start+1;
            end=end-1;
        }
        return arr;
    }
}
