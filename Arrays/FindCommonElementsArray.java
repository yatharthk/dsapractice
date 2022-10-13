package dsaPractice.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//QUESTION: find the common elements in 2 arrays of different size and all positives.
// Both arrays are sorted in non-decreeasing order.
//Can it be optimised?.If yes Try giving a solution in O(n).


public class FindCommonElementsArray {
    public static void main(String[] args) {
        int []arr1={1,2,2,2,3,3,4};
        int []arr2 = {2,2,3,3};
//        int []arr1={3};
//        int []arr2 = {6};
//        findCommonElementsNaive(arr1,arr2).forEach(System.out::println);
//        findCommonElementsOptimized(arr1,arr2).forEach(System.out::println);

    }

    private static List<Integer> findCommonElementsNaive(int[] arr1, int[] arr2) {
        int m = arr1.length-1;
        int n = arr2.length-1;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int element = arr1[i];
            for (int j = 0; j < n; j++) {
                if(element == arr2[j]){
                    ans.add(arr2[j]);
                    arr2[j] = Integer.MIN_VALUE; // did this so that it cannot use this number again.
                    break;
                }
            }
        }
        if (ans.isEmpty()){ans.add(-1);}
        return ans;
    } //O(M*N)


    //explanation:
// consider the given condition : sorted in non-decreasing way. and all positives.
//  "non-decreasing" means it is in ascending order.
//    using this we can check:
//    Condition1: if arr1[0]>arr2[0] if yes->
//    it means we encountered a small number & we move to next number pointer1++;
//    Condition 2 : if match found then : add it to the list and move both the pointers forward.
//    Else -> if arr[1]<arr[2] then move its pointer/marker ahead. pointer2++;
//    (This is 2 pointer approach).
    private static List<Integer> findCommonElementsOptimized(int[] arr1, int[] arr2) {
       List<Integer> ans = new ArrayList<>();
       int i = 0;int j = 0;
       int n = arr1.length;
       int m = arr2.length;
       while(i<m&&j<n){
           if(arr1[i]==arr2[j]){
               ans.add(arr1[i]);
               i++;j++;
           } else if (arr1[i]<arr2[j]) {
               i++;
           }
           else j++;
       }
       return ans;
    }

//    O(N) HERE N =MAXIMUM SIZE FROM BOTH THE ARRAYS.
//    O(max(m,n))
}
