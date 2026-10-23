package ashok.learning.vignesh.learning06102026;

import javax.naming.BinaryRefAddr;

public class secondhighestelement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 45, 18};
        int result = findSecondHighest(numbers);
        System.out.println("second highest element:" + result);
    }

    public static int findSecondHighest(int[] numbers) {
        int highest = numbers[0];
        int secondHighest =  numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > secondHighest && numbers[i] != highest) {
                secondHighest = numbers[i];
            }
        }

        return secondHighest;

    }
}

