package dsaPractice.GFG.BitWise;

public class CountSetBitsTilln {
    public static void main(String[] args) {
//        System.out.println(naiveCountTillN(17));//naive
        System.out.println(bestCountTillN(19));
    }


    private static int naiveCountTillN(int i) {
        if(i<1) return 0;
        int sum=+1;
        for (int j = 1; j<=i; j++) {
            int count=0;
            int n=i;
            while(n>0){
                n=n&(n-1);
                count++;
            }
            sum+=count;
        }
        return sum;
    }
//this works till 17 but the missing ones need to implement.


//best ans
public static int bestCountTillN(int n){
    int x=highestPowerOfTwoTillNumber(n);
    if (n==0) return 0;

    int count = (int) (x*Math.pow(2,x-1)+(n-Math.pow(2,x)+1)+bestCountTillN((int) (n-Math.pow(2,x))));

    return count;
    // Your code here


}
    private static int highestPowerOfTwoTillNumber(int n){
        int x=0;
        while(Math.pow(2,x)<=n){
            x++;
        }
        return x-1;
    }
}





