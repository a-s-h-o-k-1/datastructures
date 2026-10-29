package ashok.learning.vignesh.learning12102026;

public class College {

    //
//    [name, setTeachers]
    static String name = "Rao'sCollege";
    Student student;
    String teachers;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public String getTeachers() {
        return teachers;
    }

    public static void setTeachers(String teachers) {
        teachers = teachers;
    }
}
