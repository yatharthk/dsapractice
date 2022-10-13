package dsaPractice.Sorting;


public class InsertionSort {
    public static void main(String[] args) {
    int[] arr= {4,12,11,20};
    insertionSort(arr);

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int  j =i-1;
            int temp = arr[i];
            while (j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
