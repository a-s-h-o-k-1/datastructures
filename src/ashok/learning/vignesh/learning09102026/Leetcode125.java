package ashok.learning.vignesh.learning09102026;

public class Leetcode125 {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9')) {

                result = result + ch;
            }
        }

        String reverse = "";

        for (int i = result.length() - 1; i >= 0; i--) {

            reverse = reverse + result.charAt(i);
        }

        return result.equals(reverse);
    }
}
