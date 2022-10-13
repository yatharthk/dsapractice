package dsaPractice.GFG.MathematicsBasicProblems;

public class NCR {
    public static void main(String[] args) {
        calculateNcr(8,2);

    }

    private static void calculateNcr(int n, int r) {
        int num = fact(n);
        int den = fact(r)*fact(n-r);
        int ans = num/den;
        System.out.println(ans);
    }

    private static int fact(int n) {
       int fact=1;
        for (int i = 1; i <=n; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
