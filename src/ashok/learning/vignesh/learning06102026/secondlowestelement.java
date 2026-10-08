package ashok.learning.vignesh.learning06102026;

public class secondlowestelement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 45, 18};
        int result = findSecondLowest(numbers);
        System.out.println("second lowest element:" + result);
    }

    public static int findSecondLowest(int[] numbers) {
        int lowest = numbers[0];
        int secondLowest =  numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
               lowest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < secondLowest && numbers[i] != lowest) {
                secondLowest = numbers[i];
            }
        }

        return secondLowest;

    }
}
