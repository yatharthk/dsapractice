package dsaPractice.Arrays;

public class FindPivotCyclicSortedArray {
    public static void main(String[] args) {
//    int arr[]={5,7,9,10,-11,-6,-3,-1,2,3,4};
    int arr[]={2,1};
    findPivotInCyclicSortedArray(arr);
    }

//    7,9,10,11= line 1 and -1,1,2 line2 and mid = 10;
    private static void findPivotInCyclicSortedArray(int[] arr) {
        int s=0;
        int e = arr.length;
        int mid = s+ (e-s)/2;
        while(s<e) {
            if (arr[mid]<= arr[0]) {
                //mid will be found on the lower line side. mid  = 10 and a[0] = 5.
//                so are on the higher side come backwards.
                e = mid;
//                s=mid+1;
            } else
//                e=mid;
                s = mid+1;
            mid = s+(e-s)/2;
        }
        System.out.println(arr[s]);
    }
}
