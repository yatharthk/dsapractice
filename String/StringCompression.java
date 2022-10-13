package dsaPractice.String;

public class StringCompression {
    public static void main(String[] args) {
//        String s= "aabbccc";
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        compressString(chars);
    }

    private static void compressString(char[] chars) {
        int i = 0;
        int lastIndex = 0;
        while (i < chars.length) {
            int j = i + 1;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            //we will reach here when either we traversed the whole array or we found a different character


            //save the character first in the same array
            //then add the counted character in terms of digit and add it  back to chars array.
            chars[lastIndex++] = chars[i];
            int count = j - i;
            if (count > 1) {
                //converting count into single digit and saving to the char array.
                String cntString = String.valueOf(count);
                for (char ch : cntString.toCharArray()) {
                    chars[lastIndex++] = ch;
                }
            }
            i=j;
        }
        System.out.println("Size of the array is " + lastIndex);

        System.out.println("Compressed char array formed is");
        for (int k = 0; k < chars.length; k++) {
            System.out.print(chars[k]+" ");
        }

    }
}
