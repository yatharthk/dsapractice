package dsaPractice.Recursion;

public class SayDigits {
    static String [] str = new String[10];
    public static void main(String[] args) {
        int n=123;

        str[0]="Zero";str[1]="One";
        str[2]="Two";str[3]="Three";
        str[4]="Four";str[5]="Five";
        str[6]="Six";str[7]="Seven";
        str[8]="Eight";str[9]="Nine";
        sayDigit(n);
    }

    private static void  sayDigit(int n) {
        if(n==0){
            return ;}

        sayDigit(n/10);
        System.out.print (str[n%10]+" ");
    }
}
