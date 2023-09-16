package org.example;

public class DynamicArray {

    private int[] arr;      //Dynamic Array class based on/internally using Array
    private int nextIndex;   // this will act as a pointer or index variable

    //private static final int INITIAL_SIZE = 5; //this will be the starting size of array;

    public DynamicArray(){
        this.arr = new int[5]; //initialSize  or wr can use this //this.arr= new int[INITIAL_SIZE];

        this.nextIndex = 0;
    }

    public int size() {
        return this.nextIndex; //nextIndex points to last index if 0 then size=0;
    }

    public void add(int element) {
        if(this.nextIndex == arr.length){  // if the nextIndex and arrayLength same then array is filled
            reAdjustArr(); // new array elements need new space to get added to array.
        }
        arr[this.nextIndex] = element;
        nextIndex++;
    }

    private void reAdjustArr() {
        int[] temp = this.arr;          //copy the old array somewhere
        arr = new int[arr.length * 2];  //initialize new array keeping it double the size and
                                            // point the reference back to initial arr.
        for(int i = 0 ;i<temp.length ;i++){ //loop the copied old Array
            arr[i]=temp[i];                 // add the elements to new array
        }
//   here return is not needed as the same arr reference is being used everywhere
//   and now it is pointing to new array.
    }


    public void set(int inputIndex, int value) {
        if(inputIndex > nextIndex){   // if input index is > index of array : invalid insertion
            return;
        }
        if(inputIndex< nextIndex){  // if index lies inside the array size/nextIndex insertion successful
            arr[inputIndex]=value;
        }
        else {
            add(value); // if inputIndex == nextIndex then add the element (note: nextIndex is always + 1)
        }
    }

    public int get(int index) { //get the element at index number
        return arr[index];
    }

    public boolean isEmpty() {
        return this.nextIndex==0;
    }

    public int removeLast() {
        if(this.size()==0) {
            return -1;
        }
        int val = arr[nextIndex-1]; // if array has something then copy the value in it.
        arr[nextIndex-1]=0;    // set the last element in array to 0
        nextIndex--;           // decrease the nextIndex value to reflect decrease in size of array
        return val;            // return the lastIndex value
    }
}
