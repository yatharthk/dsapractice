package dsaPractice.Arrays;

public class Sort01{
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,0,1,0};
        sortO12(arr);
    }

    private static void sortO12(int[] arr) {
        int i=0;int j = arr.length-1;
        while(i<j){
            while(arr[i]==0&& i<j){
                i++;
            }
            while(arr[j]==1 && i<j){
                j--;
            }
            if (arr[i]==1 && arr[j]==0 && i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
