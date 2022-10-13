package dsaPractice.Arrays;

import java.util.ArrayList;
import java.util.List;

//Question: given array and target. find the triplet making sum - target
public class TripletWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 12;
        findTripletsNaive(arr, target).forEach(System.out::println);
    }

    private static List<List<Integer>> findTripletsNaive(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==target) {
                        List<Integer> tripletList = new ArrayList<>();
                        tripletList.add(arr[i]);
                        tripletList.add(arr[j]);
                        tripletList.add(arr[k]);
                        ans.add(tripletList);
                    }
                }
            }
        }
        return ans;
    }
}
