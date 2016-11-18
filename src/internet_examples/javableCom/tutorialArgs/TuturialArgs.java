package internet_examples.javableCom.tutorialArgs;

public class TuturialArgs {
    public static void main(String[] args) {
        Panasonic_a1 panas = new Panasonic_a1();
        start(panas);

        Panasonic_a1 panas1 = new Panasonic_a1();
        panas1.heigh = 19;
        panas1.weight = 20;
        panas1.width = 15;
        start(panas1);
        start(new Panasonic_a1());
    }

    static void start(Panasonic_a1 a) {
        System.out.println(a);

        System.out.println(a.heigh);
        System.out.println(a.weight);
        System.out.println(a.width);

        a.on();
        a.showChannels();
        a.off();
    }
}
