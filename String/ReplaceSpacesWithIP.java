package dsaPractice.String;

public class ReplaceSpacesWithIP {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        System.out.println(replaceSpaces(str));

    }

    public static StringBuilder replaceSpaces(StringBuilder str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("@40");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }
}
