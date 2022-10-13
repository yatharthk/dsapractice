package dsaPractice.Recursion;

public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "abcba";
       boolean ans =  checkPalindrome(s,0);
        System.out.println(ans);
    }
//with 2 pointers i and j
//    private static boolean checkPalindrome(String s,int i,int j) {
//        if(i>j) return true;
//        if(s.charAt(i)!=s.charAt(j)){
//            return  false;
//        }
//        else return checkPalindrome(s,i+1,j-1);
//    }

//    with single pointer i
    private static boolean checkPalindrome(String s,int i) {
        if(i>s.length()-1) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return  false;
        }
        else return checkPalindrome(s,i+1);
    }
}
