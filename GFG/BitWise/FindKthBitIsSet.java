package dsaPractice.GFG.BitWise;

public class FindKthBitIsSet {

    public static void main(String[] args) {
        int n =0 , k = 1;
//        System.out.println(kthbit(n,k));

//    ip: n,k where n is input decimal number  and k is position of bit.
//op   true or false if bit is set/unset respect.

//    Approach 1: Naive:
//    take the number . convert it in bits.
//    Loop and check the bit on the kth position.
        String str="";
        if(n==0) System.out.println(false);System.exit(1);

        while(n>0){
            str=n%2+str;
            n=n/2;
        }

        System.out.println(str);

        if(str.charAt(k-1)=='0') System.out.println(false);
            else System.out.println(true);


//    Approach 2: Left Shift :  shift one to desired k position and then check with the number
//   n= 5 and k=3 -> 0101 left shift 1 to k-1 positions and check 1 with n . if ==0
//
//
    }

    private static boolean kthbitLeftShift(int n, int k) {
        if ((n & (1 << (k - 1))) == 1)
            return true;
        else return false;
    }

//      Approach 3: Right Shift
private static boolean kthbitRightShift(int n, int k) {
        //shift the bit to check to the right most bit and check with 1
    return ((n>>(k-1))&1 )==1 ? true:false;
}



}
