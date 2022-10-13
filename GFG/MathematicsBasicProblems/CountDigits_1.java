package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class CountDigits_1 {
    public static void main(String[] args) {
        System.out.println(countDigits(-1));
    }

    private static int countDigits(int n) {
        int num = 0;
        while(Math.abs(n)>0){
            num++;
            n=n/10;
        }
        return num;
    }
}
