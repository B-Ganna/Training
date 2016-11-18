package denis_prokopjuk.webinar2306.ex3;


public class Child extends Parent {
    public Child() {
        super(); // super -должно быть ПЕРВОЙ строкой, и вызываться первым!!
        // TODO:   super можно не вызывать, его вызовет JVM
        System.out.println("Child");
    }

    public Child(int age) {
        super();
        System.out.println("Child.Age" + age);
    }
}
