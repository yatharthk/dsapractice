package dsaPractice.Recursion;

public class ReverseAStringUsingRecursion {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        if (s.isEmpty()) return s;

        return reverseString(s.substring(1))+s.charAt(0);
    }
}
