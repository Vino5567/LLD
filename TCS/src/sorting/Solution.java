package sorting;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,67,1,3,6,9};
        System.out.println(sortArray(nums));
    }

    public static String sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        mergeSort(nums, low, high);
        return Arrays.toString(nums);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; // Temporary array of fixed size
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge the two halves into the temporary array
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        // Copy the remaining elements from the left half
        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        // Copy the remaining elements from the right half
        while (right <= high) {
            temp[k++] = nums[right++];
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return; // Base case: If the range is invalid, return
        int mid = low + (high - low) / 2; // Avoid overflow
        mergeSort(nums, low, mid);       // Sort the left half
        mergeSort(nums, mid + 1, high);  // Sort the right half
        merge(nums, low, mid, high);     // Merge the two halves
    }
}
