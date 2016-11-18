package denis_prokopjuk.webinar2306.ex3;


public class App4 {
    public static void main(String[] args) {
        // TODO:   вызывая Child - мы вызовем три конструтора (GrandParent --> Parent --> Child)

        //Parent p = new Parent();
        Child child = new Child(11);

        GrandParent gp = new Child();
        Parent parent = new Child();

        Child myChild = (Child)gp;

    }
}
