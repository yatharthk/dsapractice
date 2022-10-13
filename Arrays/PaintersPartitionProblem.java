package dsaPractice.Arrays;

public class PaintersPartitionProblem {

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5};
        int noOfPainters = 2;
        System.out.println(findMinimumTimeRequiredFor1PainterToPaint(arr, noOfPainters));
    }

    private static int findMinimumTimeRequiredFor1PainterToPaint(int[] arr, int noOfPainters) {

        //search space wil be between 1 and sum of arr
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        int s = 0;
        int e = sum;
        int mid = s + (e - s) / 2;
        int ans = 0;
        while (s <= e) {
            System.out.println("mid is" + mid + "s= " + s + "e is=" + e);
            if (isPossible(arr, arr.length, noOfPainters, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        System.out.println("ans is "+ans);
        return ans;
    }

    private static boolean isPossible(int[] arr, int lengthOfGivenTask, int noOfPainters, int mid) {
        int painterCount = 1;
        int totalPossibleTask = 0;

        for (int i = 0; i < lengthOfGivenTask; i++) {
            if (totalPossibleTask + arr[i] <= mid) {
                totalPossibleTask += arr[i];
//                System.out.println(totalPossibleTask);
            } else {
                painterCount++;
                if (painterCount > noOfPainters || arr[i] > mid) {
                    return false;
                }
                totalPossibleTask = arr[i];
            }
            if (painterCount > lengthOfGivenTask) {
                return false;
            }

        }
        System.out.println("painterCount = " + painterCount);
        return true;
    }

}
