package dsaPractice.Arrays;

//Question: Given a sorted array , find the first and last indexes of
public class FindFirstAndLastOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,3,3,5};
        int key = 1;
        int n= arr.length;
        findFirstOccurrence(arr,n,key);
        findLastOccurrence(arr,n,key);
    }

    //SAME LOGIC FOR BINARY SEARCH :
    private static void findFirstOccurrence(int[] arr,int n, int key) {

        int low = 0;
        int high = n-1;
        int mid = low + (high-low)/2;
        int ans=-1;

        while(low<=high){
            if(arr[mid] == key){
                ans=mid;
                high=mid-1;
            }
            else if(key<arr[mid]){
                high = mid-1;
            }
            else low = mid+1;

            mid  = low +(high-low)/2;
        }
        System.out.println(ans);

    }

    private static void findLastOccurrence(int[] arr,int n, int key) {

        int low = 0;
        int high = n-1;
        int mid = low + (high-low)/2;
        int ans=-1;
        while(low<=high){
            if(arr[mid] == key){
                ans = mid;
                low = mid+1;
            }
            else if(key<arr[mid]){
                high = mid-1;
            }
            else low = mid+1;

            mid  = low + (high-low)/2;
        }
        System.out.println(ans);

    }
}
