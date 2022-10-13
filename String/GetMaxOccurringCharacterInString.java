package dsaPractice.String;

import java.util.Arrays;

public class GetMaxOccurringCharacterInString {

    public static void main(String[] args) {
//        String str = "testsample";
        String str = "output";
        getMaxOccurringCharacter(str);
    }

    private static void getMaxOccurringCharacter(String str) {
        //create an int array of size 26 same as total no of characters in english
//        this will be used for storing the count of characters.
        // Loop in the string and convert upper/lower case  characters to index no. ie. A/a denotes 0,Z/z=25
        // when that index nu occurs arr[index] = +1;
        int[] arr = new int[26];
        Arrays.fill(arr,0);

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int indexNo = -1;
            if(ch>='a' && ch<='z'){
                //lower case character found.
                indexNo = ch-'a';
                //update the number on this index.
                arr[indexNo]=arr[indexNo]+1;
            }
            else if(ch >='A' && ch<='Z'){
                indexNo = ch-'A';
                arr[indexNo]=arr[indexNo]+1;
            }

        }

        int max = -1;
        int ans = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                ans = i;
                max = arr[i];
            }
        }
        //"ans" variable now has the maxOccurredCharacter index. and characters we took all in same case
//        we are displaying small letters as o/p.
        System.out.println("Max character occurred is "+ (char)(ans+'a'));


    }
}
