package dsaPractice.GFG.BitWise.MathematicsBasicProblems;


public class LcmUsingGcd {
    public static void main(String[] args) {
        System.out.println(lcmUsingGcd(12,24));
    }

    //gcd code.
    private  static int gcd(int a,int b){
        if (b==0) return a;
        else return gcd(b,a%b);
    }

    //lcm code using gcd.
    private static int lcmUsingGcd(int a, int b) {
        return  a*b/gcd(a,b);
    }
}
