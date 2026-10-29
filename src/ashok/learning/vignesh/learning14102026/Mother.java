package ashok.learning.vignesh.learning14102026;

public class Mother extends GrandMother{
    int age = 45;
    String name="Rama";

    public void cooking() {
        System.out.println(name + ":  cooked fish curry");
    }

    public void cleaning() {
        System.out.println(name + ":  is cleaning");
    }

    public int getAge() {
        return age;
    }

}
