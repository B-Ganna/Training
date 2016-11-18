package internet_examples.javableCom.interfaceEx;

public class T implements Test, Test2,Test3 {
    @Override
    public void test() {
        System.out.println("Test");
    }

    @Override
    public void test2() {
        System.out.println("Test2");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void start2() {
        System.out.println("Start2");
    }

    @Override
    public void tut() {
        System.out.println("Here");
    }

    @Override
    public void tut2() {
        System.out.println("Here2");
    }
}
