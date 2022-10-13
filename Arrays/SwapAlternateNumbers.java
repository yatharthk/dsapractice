package dsaPractice.Arrays;

public class SwapAlternateNumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,7,8,5};
//        int arr[] = {5,2,9,4,7,6,1,0};
        int n = arr.length-1;

        System.out.println("Arrays before swapping");
        printArray(arr, n);
        System.out.println();


        int swappedArr[] = swapAlternate(arr,n);

        System.out.println("Arrays before swapping");
        printArray(swappedArr, n);
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i <=n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] swapAlternate(int[] arr, int n) {
        for (int i = 0; i <n;) {
             if(i+1<=n){
                 int temp = arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
             }
             i+=2;
        }
        return arr;
    }
}
