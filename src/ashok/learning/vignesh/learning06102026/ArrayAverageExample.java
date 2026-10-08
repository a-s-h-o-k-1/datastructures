package ashok.learning.vignesh.learning06102026;

public class ArrayAverageExample {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50, 60};
        System.out.println("Array elements:");
        printArray(arr);
        int sum = getsum(arr);
        int count = arr.length;
        double average = sum / count;
        System.out.println("sum of all elements: " + sum);
        System.out.println("Number of elements:" + count);
        System.out.println("Average of array elements: " + average);

    }
    public static int getsum (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
