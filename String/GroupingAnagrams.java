package dsaPractice.String;

import java.util.*;

public class GroupingAnagrams {

    public static void main(String[] args)
    {

        // Driver program
        String arr[]
                = { "cat", "dog", "tac", "god", "act" };
        printAnagrams(arr);
    }

    private static void printAnagrams(String[] arr) {

        Map<String, List<String>> map = new HashMap<>();

        //take the first string .
//        break the string to characters sort them and push it to map`

        for(int i = 0 ;i<arr.length;i++){
            String word  = arr[i];
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String temp = new String(charArray);

            if(map.containsKey(temp)){
                map.get(temp).add(word);
            }
            else{
                List<String> wordsList = new ArrayList<>();
                wordsList.add(word);
                map.put(temp,wordsList);
            }
        }

        // from map use the key and get the values out.

        for(String key:map.keySet()){
            List<String> values = map.get(key);
            values.forEach(x->System.out.print(x+" "));
//            if(values.size()>1){
//                System.out.println(values);
//            }
        }
    }
}
