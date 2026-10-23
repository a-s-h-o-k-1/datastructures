package ashok.learning.vignesh.learning06102026;

import java.util.Arrays;

public class Reversingarray {
    public static void main(String[] args) {
        /*int[] sortedNumbers = new int[]{4, 6, 8, 9, 12, 15};
        reverseArray(sortedNumbers);*/


        int[] arr = {10, 20, 30, 40, 50};
        int[] result = reverse(arr);
        System.out.println("original Array: [10, 20 , 30, 40, 50]");
        System.out.println("Reversed Array: " + Arrays.toString(result));
    }

   /* public static void reverseArray(int[] numbers) {
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");

        }
    }*/


    public static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;

    }

}
