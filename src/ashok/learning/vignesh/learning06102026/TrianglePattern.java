package ashok.learning.vignesh.learning06102026;

public class TrianglePattern {
    public static void main(String[] args) {
        trianglePattern();
    }

    public static void trianglePattern() {
        int end = 4;
        int count = 0;

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    if (i == 0) continue;
                    System.out.print("*");
                    count = count + 1;
                    if (j <= 3) {
                        end = end + 1;
                        for (int start = j + 1; start <= end; start++) {
                            if (start == end) {
                                System.out.print("*");
                                count = count + 1;
                            } else {
                                System.out.print(" ");
                            }

                        }
                    }

                } else {
                    System.out.print(" ");
                }
            }
            if(i!=0) {
                System.out.println();
            }
        }
        for(int k =0; k<=8;k++){
            System.out.print("*");
        }
    }


}