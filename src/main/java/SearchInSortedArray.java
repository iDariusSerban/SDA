import java.util.ArrayList;
import java.util.List;

public class SearchInSortedArray {

    // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
    // Given the array nums after the possible rotation and an integer target,
    // return the index of target if it is in nums, or -1 if it is not in nums.

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;

        int result1 = searchTarget(rotatedArray, target);
        int result2 = searchRotatedArray(rotatedArray, target);

        System.out.println(result1);
        System.out.println(result2);

    }
    public static int searchTarget ( int[] arr, int target){

        //brute force
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==target){
                return i;
            }
        }
       return -1;

    }

    public static int searchRotatedArray(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = nums[mid];

            if (midValue == target) {
                return mid;
            }

            if (nums[low] <= midValue) {
                // Left half is sorted
                if (nums[low] <= target && target < midValue) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right half is sorted
                if (midValue < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // target not found
    }




}
