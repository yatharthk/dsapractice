package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        findTrailingZeroes(25);
        betterApproach(11);
    }

// This worked for smaller numbers as number of digits coming will break the datatype limit.
    private static void findTrailingZeroes(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        System.out.println(res);
    }

    private static void betterApproach(int n) {
        int res=0;
        for(int i =5;i<=n;i=i*5){
            res=res+n/i;
        }
        System.out.println(res);
    }

}

