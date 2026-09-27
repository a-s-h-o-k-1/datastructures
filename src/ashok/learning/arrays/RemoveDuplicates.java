package ashok.learning.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1,1,1,2,3};
        int len = removeDuplicates(nums);
        for(int i=0; i<len; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i + 1);
        return i + 1;
    }


}
