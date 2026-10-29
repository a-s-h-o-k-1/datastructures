package ashok.learning.vignesh.learning12102026;

public class SwappingStrings {
    public static void main(String[] args) {
        String a = "HELLO";
        String b = "JAVA";

//        swap(a, b);
        swapwithVariable("Ashok ","kumar");
    }

    public static void swapwithVariable(String a , String b){
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        String temp ="";
        temp =a;
        a =b;
        b= temp;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }




    public static void swap(String a, String b) {
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;// hellojava 9- 4 =5 // 0 to 5
        int end = a.length() - b.length();
        b = a.substring(0, end);//b = hello
        a = a.substring(b.length());
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
