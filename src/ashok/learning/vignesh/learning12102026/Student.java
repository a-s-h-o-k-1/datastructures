package ashok.learning.vignesh.learning12102026;

public class Student {
    String name;
    int age;

    //paramterized constructor/with argument constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
    //recommended way
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
