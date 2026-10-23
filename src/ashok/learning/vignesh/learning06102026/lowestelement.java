package ashok.learning.vignesh.learning06102026;

public class lowestelement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 45, 18};
        int result = findlowest(numbers);
        System.out.println("Lowset Element: " + result);

    }

    public static int findlowest(int[] numbers) {
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        return lowest;

    }
}