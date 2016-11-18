package internet_examples.javableCom.abstraction;

public class Acer extends Notebooks {
    @Override
    void on() {
        System.out.println("I'm on");
    }

    @Override
    void jobB() {
        System.out.println("Work on battery");
    }

    @Override
    void off() {
        System.out.println("I'm off");
    }

    @Override
    void tmc() {

    }
}
