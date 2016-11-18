package denis_prokopjuk.webinar2306.ex3;

public class Parent extends GrandParent{

    public Parent() {

        // TODO: я могу выбирать, посредством какого конструктора вызывать предка
        //super();
        //super(1);
        //super("Test");
        super("Test",1);
        System.out.println("Parent");
    }
}
