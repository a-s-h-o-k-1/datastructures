package ashok.learning.patterns;

public class TrianglePattern {
    public static void main(String[] args) {
        trianglePattern();
    }

    private static void trianglePattern() {

        for(int i =4; i>=0;i--){
            for(int j =0;j<=i;j++){
                if(i==j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                if(i==0){
                    for(int k=1; k<=4;k++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

}
