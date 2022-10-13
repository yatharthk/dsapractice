package dsaPractice.Recursion;

public class CountNoOfWaysToReachNthStair {
//    LC:

//    Each time tou ac either take 1 step or 2 steps.

    public static void main(String[] args) {
        int nStairs = 4;
        System.out.println(countDistinctWayToClimbStair(nStairs));
    }

    private static int countDistinctWayToClimbStair(int n) {
        if(n<0) return 0;
        if(n==0) return 1;
        return countDistinctWayToClimbStair(n-1)+countDistinctWayToClimbStair(n-2);
    }
}
