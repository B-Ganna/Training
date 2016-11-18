package denis_prokopjuk.webinar3006.exceptions;


public class Child extends Parent {

    @Override
    public void makeAction() throws Exception {
        System.out.println("Child.makeAction");
    }
}
