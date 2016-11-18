package internet_examples.javableCom.inheritance;


public class Notebook extends Computer {
    @Override
    void on() {
        super.on();
        System.out.println("Я ноутбук, я включен");
    }


    void jobB() {
        System.out.println("Работа от батареи");
    }
}
