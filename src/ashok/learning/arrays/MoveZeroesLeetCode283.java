package ashok.learning.arrays;

public class MoveZeroesLeetCode283 {
    public static void main(String[] args) {
        int[] numbers = {1,1,0,0,3,1,2};
        moveZeroes(numbers);

    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left= left + 1;
            }
        }

    }
}
