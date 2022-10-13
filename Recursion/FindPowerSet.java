package dsaPractice.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindPowerSet {

    public static void main(String[] args) {
        String s="abc";
        System.out.println(findSubsequences(s));
    }

    private static List<String> findSubsequences(String s) {
        List<String> ans = new ArrayList<>();
        String output = "";
        int index = 0;
       return subsequences(s,output,index,ans);
    }

    private static List<String> subsequences(String s, String output, int index, List<String> ans) {
    //base case
        if(index >= s.length()){
            ans.add(output);
            return ans;
        }

//        exclude
        subsequences(s,output,index+1,ans);

        //include
        char element = s.charAt(index);
        output+=element;
        subsequences(s,output,index+1,ans);
        return ans;
    }

}
