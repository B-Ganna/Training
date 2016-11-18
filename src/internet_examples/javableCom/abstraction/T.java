package internet_examples.javableCom.abstraction;


public class T extends Computer {
    @Override
    void on() {
        System.out.println("I'm on");
    }

    @Override
    void off() {
        System.out.println("I'm off");
    }

    @Override
    void tmc() {

    }
}
