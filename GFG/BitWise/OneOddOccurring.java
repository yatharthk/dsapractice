package dsaPractice.GFG.BitWise;


//Q: find the missing number from a given list.

//Ip: [4,3,4,4,4,5,5]
// Op: find the only odd occurring number from the list.



public class OneOddOccurring {

    //Best Approach:
//    Use xor to find the number :
//    Point to note xor of self = 0 i.e. 1^1=0. or  0 ^ 0 = 0
//
/*
Xor Table goes like
--------
0 ^0 = 0
0 ^ 1 =1
1 ^ 0 =1
1 ^ 1=0
*/
    public static void main(String[] args) {
        int[] arr = {4,3,4,4,4,5,5};
        int res = 0;
        for (int i : arr) {
            res=res^i;
        }
        System.out.println(res);
    }
}
