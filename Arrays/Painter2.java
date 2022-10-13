package dsaPractice.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Painter2
{
    public static void main(String[] args) {
//        int arr[] = new int[]{10,20,30,40};
//        int arr[] = new int[]{5,5,5,5};
        int arr[] = new int[]{5,10,1,3,2,4,2,9,2,8};
        ArrayList<Integer> l1 = (ArrayList<Integer>) IntStream.of(arr).boxed().collect(Collectors.toList());
        int  k =2;
        System.out.println(findLargestMinDistance(l1,k));
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
//        Collections.sort(boards);
        int sum=0;
        for(int i:boards){
            sum+=i;
        }

        int s = 0;
//        int e = boards.size();
        int e = sum;
        int mid = s+ (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(!isPossible(boards,boards.size(),k,mid)){
                s=mid+1;
            }else{
                ans = mid;
                e= mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
        //    Write your code here.
    }

    private static boolean isPossible(ArrayList<Integer> boards,int listSize,int noOfPainters,int mid){

        int painterCount=1;
        int taskDoneTillNow = 0;
        for (int i=0;i<listSize;i++){
            if(taskDoneTillNow + boards.get(i)<=mid){
                taskDoneTillNow+=boards.get(i);
            }
            else{
                painterCount++;
                if(painterCount>noOfPainters || boards.get(i)>mid){
                    return false;
                }
                taskDoneTillNow = boards.get(i);
            }
            if(painterCount>noOfPainters){
                return false;
            }
        }
        return true;
    }
}
