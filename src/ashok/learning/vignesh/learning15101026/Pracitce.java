package ashok.learning.vignesh.learning15101026;

public class Pracitce {
    static {
        System.out.println("staic -1");
    }

    static {
        System.out.println("staic -2");
    }

    static {
        System.out.println("staic -3");
    }

    {
        System.out.println("non-staic -1");
    }

    {
        System.out.println("non-staic -2");
    }

    {
        System.out.println("non-staic -3");
    }

    public static void main(String[] args) {

        Pracitce p = new Pracitce();
    }
}
