package ashok.learning.vignesh.learning09102026;

public class Student {
    int age;
    String name;

    //consturctor-->used to intialize the varialbes;
    //consturctor -->used to create a object
    //implicit constructor(no arguments/without parametrized construcctor)


    public Student() {
        System.out.println("constructor is called");
    }

    //explicit/manual constructors
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("name of the student: "+name);
    }
}
