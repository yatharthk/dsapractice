package dsaPractice.Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n =arr.length;
        int k =7;
        System.out.println(binarySearch(arr,n,k));
    }

    static  int solve(int[] arr,int s,int e,int k){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == k ) return mid;
        if(arr[mid]<k){
            return solve(arr,mid+1,e,k);
        }
        else{
            return solve(arr,s,mid-1,k);
        }
    }
    private static int binarySearch(int[] arr, int n, int k) {
        return solve(arr,0,n,k);
    }
}
