package dsaPractice.Arrays;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Q: find all the pairs which adds up to the target given.
//Condition: Each pair should be sorted.
//Condition 2 each sorted pair should also be sorted while returning
public class PairSumEqualsTarget {
    public static void main(String[] args) {

//        int arr[] = {1, 2, 3, 4, 5, 8}; target=5
        int arr[] = {2,-3,3,3,-2};
        int target = 0;

        findAllPairs(arr, target).forEach(System.out::println);
    }

    private static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] ==target){
//                    push to list  but pushing values in sorted order.
//                    minimum from both arr[i] and arr[j].first then larger value
                    List<Integer> pairList = new ArrayList<>();
                    pairList.add(Math.min(arr[i],arr[j]));
                    pairList.add(Math.max(arr[i],arr[j]));
                    ans.add(pairList);
                }
            }
        }
        return ans.stream().sorted(Comparator.comparingInt(p->p.get(0))).collect(Collectors.toList());
    }
}