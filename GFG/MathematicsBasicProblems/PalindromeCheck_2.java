package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class PalindromeCheck_2 {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome(414));
    }

    private static boolean checkForPalindrome(int n) {
        int temp = n;
        int rev = 0;
        int rem= 0;
        while(temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp= temp/10;
        }
        return (n == rev);
    }
}
