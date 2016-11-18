package denis_prokopjuk.webinar3006.exceptions;


public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.makeAction();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
