package java2notice_tutorial.fundamentals;


public class MyStaticVsConstructor {
    static {
        System.out.println("I am in static block");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");
    }

    public MyStaticVsConstructor() {
        System.out.println("I'm in in constructor");
    }

    public static void main(String[] args) {
        MyStaticVsConstructor ksv1 = new MyStaticVsConstructor();
        MyStaticVsConstructor ksv2 = new MyStaticVsConstructor();
        MyStaticVsConstructor ksv3 = new MyStaticVsConstructor();
        MyStaticVsConstructor ksv4 = new MyStaticVsConstructor();
    }
}
