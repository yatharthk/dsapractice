package dsaPractice.Recursion;

public class FibonacciSeriesNthTerm {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        // base case = 0 and 1
//        for other values  : processing is last term+secondLastTerm

        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
}
