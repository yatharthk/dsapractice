package dsaPractice.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,7,9};
        int arr2[] = {2,4,6};
        int[] arr =merge(arr1,arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
//                arr3[k] = arr1[i];
//                i++;
//                k++;
//                can be written as
                arr3[k++] = arr1[i++];
            } else {
//                arr3[k] = arr2[j];
//                j++;
//                k++;
//                can be written as
                arr3[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
//            arr3[k]=arr1[i];
//            k++;
//            i++;
//            can be written as
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length){
//            arr3[k] = arr2[j];
//            k++;
//            j++;
//            can be written as
            arr3[k++]=arr2[i++];
        }
        return arr3;
    }
}
