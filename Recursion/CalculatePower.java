package dsaPractice.Recursion;

public class CalculatePower {

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

    private static int power(int a, int b) {
        if(b == 0) return 1;
        int temp= power(a,b/2);

        if(b%2==0){
            return temp*temp;
        }
        else{
            return a*temp*temp;
        }
    }
}
