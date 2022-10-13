package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGcd(12,15));
    }

//    Best approach

    private static int findGcd(int a, int b) {
        if (b==0) return a;
        else  return findGcd(b,a%b);
    }
}
