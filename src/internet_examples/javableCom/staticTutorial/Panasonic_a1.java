package internet_examples.javableCom.staticTutorial;

public class Panasonic_a1 {
    static void test() {
        System.out.println("Тест прошел");
        Panasonic_a1 a1 = new Panasonic_a1();
        a1.on();
    }

    byte weight = 2;
    byte heigh = 3;
    byte width = 4;


    void on() {
        System.out.println("Я включился");
    }

    void off() {
        System.out.println("Я выключился");
    }

    void showChannels() {
        System.out.println("Показываю каналы");
        test();
    }


}
