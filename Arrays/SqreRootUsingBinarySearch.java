package dsaPractice.Arrays;

public class SqreRootUsingBinarySearch {
    public static void main(String[] args) {
        int n = 37;
        int integerPart = sqrtIntegerUsingBs(n);
        System.out.println(integerPart);
        double sqrt = morePrecision(37,3,integerPart);
        System.out.println(sqrt);
        System.out.println(Math.sqrt(n));
    }

    private static double morePrecision(int n, int precision, int integerPart) {
        double factor = 1;
        double ans = integerPart;

        for (int i = 0; i < precision; i++) {
            factor = factor/10;
            System.out.println("i= "+i);
            for (double j=ans;  j*j<n ; j=j+factor) {
                System.out.println("j is "+j);
                ans = j;
            }
        }

        return ans;
    }

    private static int sqrtIntegerUsingBs(int n) {
        if(n==0) return 0;
        int s = 1;
        int e = n;
//         we are able to use binarySearch as the numbers from 0 to n are sorted.
//        The numbers between 0 to n is known as SEARCH SPACE AND HERE THE ANSWER LIES.
        int mid = s+(e-s)/2;
        int ans = -1;
        while (s<=e){
            //For larger values we will surely get Integer memory overflow error for mid*mid
            if(mid > Integer.MAX_VALUE/mid){ e= mid-1;}

            else if(mid*mid ==n){
                return mid;
            }
            else if( mid*mid<n){
                ans = mid;
                s= mid+1;
            }
            else
            {
                e=mid-1;

            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
