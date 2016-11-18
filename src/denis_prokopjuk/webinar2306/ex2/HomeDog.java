package denis_prokopjuk.webinar2306.ex2;


public class HomeDog extends Dog {
    // TODO: отношение "is - a": все, что наследуется или имплементирует интерфейс - проходит это отношение
    static {
        System.out.println("HomeDog static block1");
    }

    {
        System.out.println("\t HomeDog.block1");
    }

    {
        System.out.println("\t HomeDog.block2");
    }

    public HomeDog() {
        System.out.println("\t\t HomeDog Constructor");
    }

    static {
        System.out.println("HomeDog static block2");
    }


}
