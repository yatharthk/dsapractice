package dsaPractice.Arrays;


//Question: Given a mountain array :
//arr.length >= 3
//        There exists some i with 0 < i < arr.length - 1 such that:
//        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//        arr[i] > arr[i + 1] > ... > arr[arr.length - 1] this means max element will be somewhere
//        such that elements  are written in as min to max then going down to min.

//            (peak value)
//               /     \
//             s/       \e
public class PeakInAMountainArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,2,0,};
        findPeakElement(arr);
    }

    //approach:
//    since the elements are sorted from either min to max or max to min.
//    we can use binary search approach.
//    and divide the array using mid element.
    private static void findPeakElement(int[] arr) {

        int s = 0;
        int e = arr.length;
        //iwe taking  (e-s)/2 just to avoid memory failure on the higher side.
        // i.e. s+e should not go beyond integer.max_value
        int mid = s+(e-s)/2;

        while(s<e) {
            if (arr[mid] < arr[mid + 1]) {
//                we found the arr[mid+1] element has greater value so current arr[mid] is not a peak
//               since peak can not be small . we go towards up.
//                                (peak)
//                                /
//                mid is on this / going up this line.
//                            0 /
//                and since mid of the line is not greatest we move the start to mid+1;
                s = mid + 1;
            } else{
//                if arr[mid]>arr[mid+1] then the arr[mid] value is already on the higher side.
//                so mid can either be the peak value or the mid is in other increasing line.
//                (peak)
//                  \
//                   \
//                    \ e = (n-1)
                e = mid;
        }
            mid = s+(e-s)/2;
        }
        System.out.println(arr[s]);

    }
}
