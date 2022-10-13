package dsaPractice.Arrays;

public class Sort012 {

    public static void main(String[] args) {
//        int[] arr = {1, 0, 1, 2, 1, 0, 0, 1, 0, 2, 2};
//        int[] arr2 = {2,0,2,1,1,0};
        int[] arr3 = {2, 0, 1};
        printArray(arr3);
//        sortO12BubbleApproach(arr);
        sortO12CounterApproach(arr3);
//        sortO12(arr);
        printArray(arr3);

    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sortO12BubbleApproach(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    private static void sortO12CounterApproach(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            if (arr[i] == 1) count1++;
            if (arr[i] == 2) count2++;
        }
//        for (int i = 0; i < count0; i++) {
//            arr[i] = 0;
//        }
//        if (count1 > 0) {
//            for (int i = count0; i <= (count0 + count1); i++) {
//                arr[i] = 1;
//            }
//        }
//        if (count2 > 0) {
//            for (int i = count0 + count1; i < arr.length; i++) {
//                arr[i] = 2;
//            }
//        }
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }
}
