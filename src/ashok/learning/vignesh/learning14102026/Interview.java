package ashok.learning.vignesh.learning14102026;

public class Interview {
    public static void main(String[] args) {
        Son vignesh = new Son();
        vignesh.setName("vignesh");

        //vignesh can do
        vignesh.study();
        vignesh.work();
        //method overloading
        vignesh.work("java");

        //getting from mother
        vignesh.cleaning();
        vignesh.cooking();
        vignesh.age = 23;
        System.out.println(vignesh.age);


    }

}
//override
//method overloading
//ambiguity(confusion)
//super keyword(calling particular variable or method in parent class)
//multiple(types)
//