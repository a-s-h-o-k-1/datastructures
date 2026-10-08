package ashok.learning.vignesh.learning06102026;

public class  highestelement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 45, 18};
        int result = findhighest(numbers);
        System.out.println("Highest Element: " + result);

    }
    public static int findhighest(int[]numbers) {
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        return highest;
    }
}
