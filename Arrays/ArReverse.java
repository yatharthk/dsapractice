package dsaPractice.Arrays;

import java.util.ArrayList;

public class ArReverse {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(2);
        l1.add(5);
        reverseArr(l1);
    }

    private static void reverseArr(ArrayList<Integer> l1) {
        int s = 0;
        int e =l1.size()-1;
        while(s<=e){
            int temp = l1.get(s);
            l1.set(s,l1.get(e));
            l1.set(e,temp);
            s++;
            e--;
        }
        l1.stream().forEach(System.out::println);
    }
}
