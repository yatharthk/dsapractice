package dsaPractice.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Sum2Arrays {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int[] b ={6};
        int[] ans = findArraySum(a,a.length,b,b.length);
        for (int i = 0; i <=ans.length-1; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        // Write your code here.
        int i = n-1;
        int j = m-1;
        int value1 = 0;
        int value2 = 0;
        int sum = 0;
        while (i>=0) {
             //num = 1 2 3 4 5 12*1000 +3 *100 +4 *10 +5*1
            int rem = a[i]%10;
            value1= (int) (Math.pow(10,n-i-1)*rem+value1);
//            System.out.println(value1);
            i--;
        }

        while (j>=0) {
            //num = 1 2 3 4 5 12*1000 +3 *100 +4 *10 +5*1
            int rem = b[j]%10;
            value2= (int) (Math.pow(10,m-j-1)*rem+value2);
//            System.out.println(value2);
            j--;
        }
        sum = value1+value2;
        System.out.println("sum is"+sum);

//        int k =0;
//            while(sum>0 && k<ans.length) {
//                ans[k] = sum % 10;
//                System.out.println(sum%10);
//                sum = sum / 10;
//                k++;
//            }

        String s = sum+"";
        String[] sArr = s.split("");

        int[] ans = new int[Arrays.asList(sArr).size()];
        for(int p=0;p<= ans.length-1;p++){
            ans[p] = Integer.parseInt(sArr[p]);
        }
        return ans;
    }
}
