package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class CheckPrime {
    public static void main(String[] args) {
//        System.out.println(checkPrimeNaive(7)); //O(n)
//        System.out.println(checkPrimeOptimise1(7)); //O(sqrt(n))
        System.out.println(superOptimised(37)); //O(sqrt(n)) almost 1/3 of prev.Optimization
    }

    private static boolean superOptimised(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;  //check divisible by 2 or 3
        for (int i = 5; i * i <= n; i = i + 6) {     // left is factors of 5,7 ;11,13; ....
                                                    // and 5 (+6) =11; 7(+6)=13 or (5+2)(+6) =13  so is next condition
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    private static boolean checkPrimeOptimise1(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean checkPrimeNaive(int n) {
        if(n==1) return false;
        for (int i = 2; i <n ; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
