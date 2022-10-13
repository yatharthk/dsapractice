package dsaPractice.String;

public class PalindromeCheck {
    public static void main(String[] args) {
//        String s = "noon";
        String s = "N2 i&nJA?a& jnI2n";
        System.out.println(checkPalindrome(s));
    }


    public static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]+", "");

        int st = 0;
        int e = s.length() - 1;
        while (st <= e) {
            if (s.charAt(st) != s.charAt(e)) {
                return false;
            } else {
                st++;
                e--;
            }
        }
        return true;
    }
}
