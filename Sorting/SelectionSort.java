package dsaPractice.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29,72,98,13,87,66,52,51,36};
        sortThisArray(arr);

    }

    private static void sortThisArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            //swap i and min value.
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
        }

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
