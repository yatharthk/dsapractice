package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class CalculatePower {

    public static void main(String[] args) {
        System.out.println(calculatePower(4, -2));
    }

    //       4       n
//     2   2    n/2 n/2
    private static int calculatePower(int x, int n) {
        if (n == 0) return 1;
        int temp = calculatePower(x, n / 2);
//        temp = temp * temp;
        if (n % 2 == 0) {
            return temp *temp;
        } else return temp * x;
    }
}
