package NumberSystem;

import java.util.*;

public class product {
    public static void main(String[] args) {
        int[] arr = {-100, -98, -1, 2, 3, 4};
        System.out.println(find(arr));
    }

    public static int find(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                nums[0] * nums[1] * nums[n - 1]);
    }
}
