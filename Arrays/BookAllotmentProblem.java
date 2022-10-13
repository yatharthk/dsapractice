package dsaPractice.Arrays;

//Question: Allot m books to n students
// condition is we need to allot books to all students sequentially.
//Each student should get minimum no of pages to allocate all the books.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookAllotmentProblem {
    public static void main(String[] args) {
        int arr[] = {6 ,6 ,6, 6, 6 ,6 ,6 ,6 ,6, 6};
        int n=10,m=20;
        System.out.println(allotBooksToStudents(arr,n,m));
    }

//    Approach: Min value we can allot to a student = 0;
//    Max value students can be allotted = sum of all given pages/books.\

//    Since the array is sorted we can now divide the array.
//    Array=[10,20,30,40] sum = 100 ,mid =50. assume there are 2 students.
//    Try 1: student 1 gets 10 and student 2 gets 20,30,40 = = 10 & 90. is this possible? maxPagesCovered form total = 90
//    Try 2: student 1 gets 10,20 and student 2 gets 30 ,40 = 30 & 70. is this possible?maxPagesCovered form total =70
//    Try 3: student 1 gets 10,20,30 and student 22 gets 40 = 60 and 40. is this possible?maxPagesCovered form total=60

//    if these are possible divisions now we need to calculate the minimum pages per person covering maxBooks.
//    so minimum from all the 3. which is(90,70,60) = 60. so 60 is the expected ans.


//    Step 1: divide the array: check mid if it is a possible minimum value.?
//    boolean isPossibleSolution(value): check if we can allot this value to the no of students.
//        create a variable for maxValuePossible and another to count the no of students.
//        if arr[i]+arr[i+1]<value
//           then we update the max value allotted maxValuePossible = maxValuePossible+arr[i+1];
//            then try for next value if yes then fine add if no
//            then add student and check if noOfStudents<givenStudents
//                and simultaneously check if arr[i+1] <arraySize;
//    if unable to  then return false 
//    else return true
    private static int allotBooksToStudents(int[] arr,int n,int m) {
        if(m>n) return  -1; //if students>books not possible do allot books to all

        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum+=arr[i];
        }

        int ans = -1;
        int s = 0;
        int e = sum;
        int mid = s+ (e-s)/2;
        while(s<=e){
            if(isPossibleSolution(arr,n,m,mid)==false){
                s = mid+1;
            }
            else {//if (isPossibleSolution(arr,m,n,mid)==true){
                ans = mid;
                e=mid-1;
            }
            mid=s+ (e-s)/2;
        }
        return ans;

    }

    private static boolean isPossibleSolution(int []arr,int n,int m,int mid) {
        //n is no of book/pages m is no of students.
        int studentCount = 1;
        int maxValuePossible=0;

        for (int i = 0; i < n; i++) {
            if(maxValuePossible + arr[i] <=mid){
                maxValuePossible += arr[i];
            }
            else { //means this is not possible to allot to student 1,
                studentCount++;
                if(studentCount>m || arr[i]>mid){
                    // check if studentCount is not greater than m student
//                    or next value in arr[i] is greater than mid. we cant allot it to student 2
                    return false;
                }
                else { //student count is added and now maxPageValue is reset for this student.
                    maxValuePossible = arr[i];
                }
                if(studentCount>m){
                    return false;
                }
            }
        }
        return true;
    }
}
