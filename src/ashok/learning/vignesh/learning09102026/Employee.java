package ashok.learning.vignesh.learning09102026;

public class Employee {
    int age;
    String name;

    public Employee() {
        System.out.println("constructor is called");
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee(int age) {
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

    public void printName() {
        System.out.println("name of the student:" + name);
    }

    public void printage() {
        System.out.println("name of the age:" + age);
    }
}
