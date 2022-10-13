package dsaPractice.Arrays._2DArray;

public class SearchIn2dMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(isPresent(arr,target));
    }

//    bruteForce method is -> go to eachelement say a[i][j] if matches then fine else proceed forward
//    good approach . we can use binary search on this 2d array.
    private static boolean isPresent(int[][] arr, int target) {
        int row= arr.length;
        int col = arr[0].length;
        int s= 0 ;
        int e = row* col;
        int mid = s+(e-s)/2;

        while(s<=e){
            //this is the position of mid-element  with row = mid/col  length  i.e. 1 \n 2 \n 3 \n.  and col = mid%col i.e. 0->1->2
            int element = arr[mid/col][mid%col];
            if(element==target){
                System.out.println("element found in index "+(mid/col) +","+(mid%col) +"position");
                return true;
            }
            else if(target>element){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
            mid = s+(e-s)/2;
        }

        return false;
    }
}
