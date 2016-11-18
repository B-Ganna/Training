package denis_prokopjuk.webinar2306.ex1;


public class Employee {

    // TODO: static -блоки вызываются только ОДИН раз, перед конструктором
    // все остальное - столько раз, сколько создали

    static {
        System.out.println("Employee static block1");
        //String t = null;

    }

    {
        System.out.println("Employee.block1");
    }

    {
        System.out.println("Employee.block2");
    }

    public Employee() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Employee static block2");
    }


}
