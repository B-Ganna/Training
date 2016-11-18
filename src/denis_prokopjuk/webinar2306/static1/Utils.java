package denis_prokopjuk.webinar2306.static1;

public class Utils {
    public String myText = "Hello!";
    public static String myStaticText = "Static.Hello!";

    static {
        System.out.println("Utils.Static block");
    }

    public Utils() {
        System.out.println("Utils.constructor");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }


}
