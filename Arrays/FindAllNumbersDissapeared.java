package dsaPractice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDissapeared {
//    LC:448
public static void main(String[] args) {
    int[] arr= {4,3,2,7,8,2,3,1};
    findDissapearedNumbers(arr);
}

    private static List<Integer> findDissapearedNumbers(int[] arr) {
        int[] freq=new int[arr.length];

        for (int i:arr) {
            System.out.print(i);
            if(freq[i]==-1){
                freq[i]+=1;
            }
            freq[i] = -1;
        }

//        for (int i <arr) {
//            if(freq[i] ==-1){
//                freq[arr[i]]=1;
//            }
//            else if(freq[arr[i]]>-1){
//                freq[arr[i]]+=1;
//            }
//        }
        for (int i:freq) {
            System.out.print(i +" ");

        }
return new ArrayList<>();
    }
}
