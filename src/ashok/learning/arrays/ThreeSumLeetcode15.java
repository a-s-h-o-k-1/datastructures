package ashok.learning.arrays;

import java.util.*;

public class ThreeSumLeetcode15 {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();


        // 1. Sort the array
        Arrays.sort(nums);
        // 2. Fix one element using i
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for i
            // This prevents duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 3. Two pointers
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                // Calculate the sum of three numbers
                int sum = nums[i] + nums[left] + nums[right];
                // Case 1: Sum is 0
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));
                    // Move both pointers
                    left++;
                    right--;
                    // Skip duplicate values on left
                    while (left < right &&
                            nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // Skip duplicate values on right
                    while (left < right &&
                            nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                // Case 2: Sum is less than 0
                else if (sum < 0) {
                    // Need a bigger sum
                    // So move left pointer forward
                    left++;
                }
                // Case 3: Sum is greater than 0
                else {
                    // Need a smaller sum
                    // So move right pointer backward
                    right--;
                }
            }
        }
        return result;
    }
}