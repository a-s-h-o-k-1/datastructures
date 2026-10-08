package ashok.learning.vignesh.learning06102026;

public class ReverseAString {

    public static void main(String[] args) {
        String input = "ashok kumar";
        String output = reverseaString(input);
        System.out.println("After reversal a String: " + output);
    }


    public static String reverseaString(String value) {

        String result = "";
        for (int i = value.length() - 1; i >= 0; i--) {

            result = result + value.charAt(i);
        }
        return result;

    }
}
