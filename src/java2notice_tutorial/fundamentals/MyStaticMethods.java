package java2notice_tutorial.fundamentals;


public class MyStaticMethods {
    private String name;
    private static String staticStr = "STATIC-STRING";

    public MyStaticMethods(String n) {
        this.name = n;
    }

    public static void testStaticMethod() {
        System.out.println("Hey... I am in static method...");
        System.out.println(MyStaticMethods.staticStr);
    }

    public void testObjectMethod() {
        System.out.println("Hey i am in non-static method");
        System.out.println(MyStaticMethods.staticStr);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        MyStaticMethods.testStaticMethod();
        MyStaticMethods msm = new MyStaticMethods("Java2Notice");
        msm.testObjectMethod();

    }
}
