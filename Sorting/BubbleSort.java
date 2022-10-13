package dsaPractice.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5,1,4,2,8};
        bubbleSortThis(arr);
    }

    private static void bubbleSortThis(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped=false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swapped) {
                break;
            }
        }

        for (int i:
             arr) {
            System.out.print(i);
        }
    }
}
