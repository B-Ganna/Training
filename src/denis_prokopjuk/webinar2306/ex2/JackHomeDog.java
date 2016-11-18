package denis_prokopjuk.webinar2306.ex2;


public class JackHomeDog extends HomeDog {
    static {
        System.out.println("JackHomeDog static block1");
    }

    {
        System.out.println("\t JackHomeDog.block1");
    }

    {
        System.out.println("\t JackHomeDog.block2");
    }

    public JackHomeDog() {
        System.out.println("\t\t JackHomeDog Constructor");
    }

    static {
        System.out.println("JackHomeDog static block2");
    }
}
