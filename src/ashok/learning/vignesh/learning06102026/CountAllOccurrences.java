package ashok.learning.vignesh.learning06102026;

public class CountAllOccurrences {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10};
        CountOccurrences(numbers);
    }

    public static void CountOccurrences(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted){
                for (int j=0; j< numbers.length; j++ ){
                    if (numbers[i] == numbers[j]){
                        count++;
                    }
                }
                System.out.println(numbers[i] + "occurs" + count + "times");
            }
        }
    }
}
