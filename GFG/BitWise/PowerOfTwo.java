package dsaPractice.GFG.BitWise;


//Check if a number is a power of 2
public class PowerOfTwo {


//    Ip: n
//    op: true or false;

//    Approach1: Naive
//    Divide the number and check if it is properly divided by 0 ;
    static boolean checkPowerOfTwo(int n) {
        if(n==0) return  false;
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;

    }

    //Appraoch 2:
//    1. Unset the only set bit using Brian-Kerningams approach
//    2. Check with 0 if it maythces with 0 then power of 2

    static  boolean powerOfTwoUsingKerningamsApproach(int n){
        if(n==0) return false;
        if ((n&(n-1))== 0){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
//        System.out.println(checkPowerOfTwo(6)?"True":"False");
        System.out.println(powerOfTwoUsingKerningamsApproach(3));
    }
}

