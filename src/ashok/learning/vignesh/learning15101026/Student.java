package ashok.learning.vignesh.learning15101026;

public class Student {

    {
        name = "vignesh";
        System.out.println("non static block called before the construcor call");
    }

    public Student(){
        System.out.println("constructor is calling");
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
