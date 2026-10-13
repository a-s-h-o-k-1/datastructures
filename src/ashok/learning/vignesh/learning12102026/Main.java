package ashok.learning.vignesh.learning12102026;

import java.util.Random;

public class Main {
   static int number;

    public static void main(String[] args) {

        Main main = new Main();
        main.number = new Random().nextInt();

        Main main1 = new Main();
        main1.number = new Random().nextInt();

        Main main2 = new Main();
        main2.number = new Random().nextInt();

        System.out.println(main.number+" ====="+main1.number+"====="+main2.number);

    }
}
