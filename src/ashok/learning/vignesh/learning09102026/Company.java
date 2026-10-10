package ashok.learning.vignesh.learning09102026;

public class Company {
    public static void main(String[] args){
        Employee vignesh = new Employee();
        vignesh.setName("vignesh");
        vignesh.printName();
        vignesh.setAge(23);


        Employee Vignesh= new Employee(23,"vignesh");
        vignesh.printName();
        vignesh.printage();


    }

}
