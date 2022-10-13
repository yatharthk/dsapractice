package dsaPractice.String;

public class RemoveAllSubstringOccurrenceFormString {

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeSubstring(s,part));
    }

    private static String removeSubstring(String s, String part) {
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}
