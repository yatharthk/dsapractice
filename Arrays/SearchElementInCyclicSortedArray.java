package dsaPractice.Arrays;


// Given arr = {10,11,1,2,3,5} find position of 3
public class SearchElementInCyclicSortedArray {
    public static void main(String[] args) {
//        int arr[] = {10,11,1,2,3,5};
//        int arr[] = {4,5,6,7,0,1,2};
        int arr[] = {1,3};
//        int key=10;
        int key = 1;
        findElementPosition(arr,key);
    }


//    Approach1 : BruteForce and check for element using linear Search
//Approach 2: CyclicSortedArray-> Sorted arrays present. so can use Binary Search Approach
//    Step1: Find the pivot Element
//    Step 2: Apply BinarySearch in any one half dividing array by checking value from pivot.

    private static void findElementPosition(int[] arr, int key) {
    int pivot = findPivotElement(arr);
    if(key >=arr[pivot] && key<=arr[arr.length-1]){
        System.out.println(binarySearchElement(arr,key,pivot,arr.length));
    }
    else
        System.out.println(binarySearchElement(arr,key,0,pivot-1));

    }

    private static int binarySearchElement(int[] arr, int key, int low, int high) {
        int s= low;
        int e = high;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==key) {return mid;}
            else if(key < arr[mid]){
                e = mid-1;
            }
            else s = mid+1;

            mid = s+(e-s)/2;
        }
        return -1;
    }

    private static int findPivotElement(int[] arr) {
        int s=0,e= arr.length-1;
        int mid = s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else e=mid;
            mid = s+(e-s)/2;
        }
        return s;
    }

}
