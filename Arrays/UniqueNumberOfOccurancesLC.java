package dsaPractice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumberOfOccurancesLC {
//LC:1207
    public static void main(String[] args) {
//        int arr[]= {1,2,2,1,1,3,2};
        int arr[]= {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(hasUniqueOccurancesOnlyArrays(arr));
    }

    private static boolean hasUniqueOccurancesOnlyArrays(int[] arr) {
        int[] freq = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length;) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            freq[i]=count;
            i+=count;
        }
        Arrays.sort(freq);
//        for (int i:freq) System.out.print(i+" ");

        for (int i = 0; i <freq.length-1; i++) {
            if(freq[i]!=0 && freq[i+1]!=0 && freq[i]==freq[i+1]){
                    return false;
                }
        }

        return true;
    }
}
