package learning17102026;

import java.util.Arrays;

public class practise {


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println("Input: " + Arrays.toString(nums));

        int[][] result = threeSum(nums);

        System.out.println("Output:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    // Method to find unique triplets
    public static int[][] threeSum(int[] nums) {

        Arrays.sort(nums);

        // Maximum possible number of triplets is n * (n - 1) * (n - 2) / 6
        int n = nums.length;
        int maxTriplets = n * (n - 1) * (n - 2) / 6;

        int[][] result = new int[maxTriplets][3];
        int count = 0;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate fixed numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result[count][0] = nums[i];
                    result[count][1] = nums[left];
                    result[count][2] = nums[right];
                    count++;

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                            nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                            nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        // Return only the triplets that were found
        return Arrays.copyOf(result, count);
    }
}



