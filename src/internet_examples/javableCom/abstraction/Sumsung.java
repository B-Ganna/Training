package internet_examples.javableCom.abstraction;


public class Sumsung extends PC {
    @Override
    void on() {
        System.out.println("Comp is started");
    }

    @Override
    void modification() {
        System.out.println("I'm modificating");
    }

    @Override
    void off() {
        System.out.println("Comp is off");
    }

    @Override
    void tmc() {
        System.out.println("Comp is counting");
    }
}
