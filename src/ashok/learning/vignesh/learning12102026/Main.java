package ashok.learning.vignesh.learning12102026;

import java.util.Random;

public class Main {
    static int number;

    public static void main(String[] args) {

        College college = new College();
        college.setName("krishna-chaitanya");

        College college1 = new College();
        college1.setName("Narayana");

        College college2 = new College();
        college2.setName("priyadarshini");

        System.out.println(college.getName() + "========" + college1.getName() + "=========" + college2.getName());


    }
}
