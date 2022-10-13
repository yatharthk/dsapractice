package dsaPractice.GFG.BitWise;

public class PoweSetOfString {
    public static void main(String[] args) {
        String s ="abc";
        int allPossibleScenarioCounts =(int) Math.pow(2,s.length());
        for (int i = 0; i < allPossibleScenarioCounts; i++) {
            for (int j = 0; j < s.length(); j++) {
                if((i & (1<<j)) !=0){
                    System.out.print(s.charAt(j));
                }

            }
            System.out.println(",");
        }

    }
}
