package ashok.learning.vignesh.learning14102026;

//multiple inheritance ->java not work
//public class Son extends Mother,GrandMother {
public class Son extends Mother {
    String name;
    float height;
    float weight;


    //wrapping -->Encapsulation
    public void setName(String abc) {
        this.name = abc;
        System.out.println("mother name is: " + super.name);
        super.cooking();
    }

    public void study() {
        System.out.println(name + " is studying ");
    }

    public void work() {
        System.out.println(name + " is working");
    }

    //    int age;
//    String name;
//
    @Override
    public void cooking() {
        System.out.println(name + " cooked biriyani");
    }

    //method overloading
    public void work(String books) {
        System.out.println(name + " working if I hav  " + books);
    }
//
//    public void cleaning() {
//        System.out.println(name + ":  is cleaning");
//    }
//
//    public int getAge() {
//        return age;
//    }

}
