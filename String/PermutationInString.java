package dsaPractice.String;

import java.util.Arrays;

//Que: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//In other words, return true if one of s1's permutations is the substring of s2.
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eiadbaoaoo";
        System.out.println(checkInclusive(s1,s2)?"true":"false");
    }

    private static boolean checkInclusive(String s1, String s2) {
        int[] count1 =new int[26];
        Arrays.fill(count1,0);
        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i)-'a';
            count1[index]+=1;
        }

        //traverse s2 string in window of size s1 and compare
        int i = 0;
        int windowSize = s1.length();
        int[] count2= new int[26];
        Arrays.fill(count2,0);
        while(i<windowSize && i<s2.length()){
            int index2=s2.charAt(i)-'a';
            count2[index2]+=1;
            i++;
        }
        if(checkEqual(count1,count2)){return true;}

        while(i<s2.length() ){
            char newChar = s2.charAt(i);
            int index = newChar -'a';
            count2[index]++;


            char oldChar = s2.charAt(i-windowSize);
            count2[oldChar-'a']--;

            i++;
            if(checkEqual(count1,count2)){return true;}
        }
        return false;
    }

    private static boolean checkEqual(int[] count1, int[] count2) {
        for (int i = 0; i < 26 ; i++) {
            if(count1[i]!=count2[i]){
                return  false;
            }
        }
        return true;
    }
}
