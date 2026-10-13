package ashok.learning.vignesh.learning12102026;


import java.util.Arrays;

public class Main {
    static String[] teachers;
    static{
      teachers= new String[3];
      teachers[0]="harsha";
      teachers[1]="ashok";
      teachers[2]="sravani";
    }

    public static void main(String[] args) {

        College college = new College();
        college.setName("krishna-chaitanya");
        College.setTeachers(Arrays.toString(teachers));

        College college1 = new College();
        college1.setName("Narayana");

        College college2 = new College();
        college2.setName("priyadarshini");

        System.out.println(college.getName() + "========" + college1.getName() + "=========" + college2.getName());


    }
}
