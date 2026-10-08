package ashok.learning.vignesh.learning06102026;

public class Sumofallelements {
    public static void main(String[] args) {
        int[] arr = {20, 50, 70, 90, 95};
        System.out.println("Array Elements :");
        printArray(arr);
        int sum = getsum(arr);
        System.out.println("sum of all elements :" + sum);

    }

    public static int getsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
