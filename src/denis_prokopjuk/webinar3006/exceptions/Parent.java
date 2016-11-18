package denis_prokopjuk.webinar3006.exceptions;


import java.io.FileNotFoundException;

public class Parent {
    public void makeAction() throws Exception{
        System.out.println("Parent.makeAction");
        throw new FileNotFoundException("test");
    }


}
