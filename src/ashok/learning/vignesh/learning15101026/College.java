package ashok.learning.vignesh.learning15101026;

import java.util.Arrays;

public class College {
    static String[] teacher;

    static {
        teacher = new String[3];
        teacher[0] = "teacher1";
        teacher[1] = "teacher2";
        teacher[2] = "teacher3";

    }

    static {
        System.out.println("static-2");

    }

    static {
        System.out.println("static-3");
    }


    public String defaultTeachers() {
        //compatible objects passing
        return Arrays.toString(teacher);

    }

}
