package ashok.learning.arrays;

public class Leetcode167 {
    public static int[] returnIndices(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;
        while(left< right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left, right};
            }
            else if(sum>target){
                right = right - 1;
            }
            else{
                left = left +1;
            }
        }
        return new int[]{};
    }
}
