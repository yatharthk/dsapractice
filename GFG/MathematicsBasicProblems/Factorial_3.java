package dsaPractice.GFG.BitWise.MathematicsBasicProblems;

public class Factorial_3 {
    public static void main(String[] args) {
//        naiveApproach(5);
        System.out.println(usingRecustion(5));
    }



    private static void naiveApproach(int n) {
        int fact = 1;
        for (int i =1;i<=n;i++){
            fact = fact*i;
        }
        //Theta(N) and  aux space is theta(1)
        System.out.println(fact);
    }


    private static int usingRecustion(int n) {
        if(n==0){
            return 1;
        }
        else {
            return n * usingRecustion(n-1);
        }
    }
//    Theta(n) and aux space is Theta(n+1)
//    naive is better approach as recursion causes extra overhead.
}
