package ashok.learning.vignesh.learning09102026;

public class College {
    public static void main(String[] args) {
        Student ashok = new Student();//implict constructor-->object cteation and varialbes intailization
        ashok.setName("ashok");
        ashok.printName();


        Student vignesh = new Student(24, "vignesh");
        vignesh.printName();


    }
}
