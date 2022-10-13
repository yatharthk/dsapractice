package dsaPractice.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

//Qus: Place the cows in stalls such that no cows hurt each other
//Condition: Minimum distance between any 2 of them is as large as possible.
public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,6}; //stalls
        int nowOfAggressiveCows = 2; //cows
        int ans = findMaxPossibleDistanceBetweenCows(arr,nowOfAggressiveCows);
        System.out.println(ans);
    }

    //minimum distance between any 2 cows is maximum.
    // c1, c2 2 cows. place this such that c2-c1 = max of all possible cases.
    // similar condition -> we can use search space logic.

    private static int findMaxPossibleDistanceBetweenCows(int[] arr, int nowOfAggressiveCows) {
        //Initialize start with 0
        int s = 0;
//      get the end value by looking at the minimum and max values given in the stall numbers
//        lest sort the array and then find end;
        Arrays.sort(arr);
        int e = arr[arr.length-1];
//        System.out.println(e);
        int mid = s+(e-s)/2;
        int ans=-1;

        while(s<=e){
            if(isPossibleToPlaceCows(arr,nowOfAggressiveCows,mid)){
                //go to right part as we need to find max
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid = s+(e-s)/2;
        }
return ans;
    }

    private static boolean isPossibleToPlaceCows(int[] arr, int nowOfAggressiveCows, int mid) {
        int cowCount=1;
        int lastCowPosition=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]-lastCowPosition>=mid){ // we need to find if c2 - c1 is max.
                cowCount++;
                if (cowCount==nowOfAggressiveCows){
                    return true;
                }
                lastCowPosition=arr[i];
            }
        }
        return false;
    }
}
