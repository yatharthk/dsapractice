package dsaPractice.Recursion;

public class MergeSortApproach1 {
    public static void main(String[] args) {
        int[] arr={2,4,7,8,23,5,4,2,1,10};
       mergeSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //divide the array in 2 halves using mid.
//    then merge the divided arrays using merge 2 arrays way
    private static void mergeSort(int[] arr, int n) {
       solve(arr,0,n-1);

    }

    private static void solve(int[] arr, int s,int e) {


        if(s>=e){
            return ;
        }

        int mid = s+(e-s)/2;
        //solve/divide the left part
        solve(arr,0,mid);

        //solve/divide the right part
        solve(arr,mid+1,e);

        merge(arr,s,e);
    }

    private static void merge(int[] arr, int s, int e) {
        int mid = s+(e-s)/2;

        //copy the values in array using halves
        int len1 = mid-s+1; //first half
        int len2 = e-mid; //second half

        int[] first = new int[len1];
        int[] second = new int[len2];

        int k=s;
        for (int i = 0; i < len1; i++) {
            first[i]=arr[k++];
        }

        k = mid+1;
        for (int i = 0; i < len2; i++) {
            second[i]=arr[k++];
        }

        //use the indexes to sort the merge the arrays
        int  i =0;
        int  j =0;

        //k reset to start for populating the sorted array
        k=s;
        while(i<len1 && j<len2){
            if(first[i]<second[j]){
                arr[k++]=first[i++];
            }
            else {
                arr[k++]=second[j++];
            }
        }
        while(i<len1){
            arr[k++]=first[i++];
        }
        while (j<len2){
            arr[k++]= second[j++];
        }
    }
}
