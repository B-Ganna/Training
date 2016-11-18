package internet_examples.javableCom.staticTutorial;


public class StaticTutorial {
    public static void main(String[] args) {
        Panasonic_a1 pan = new Panasonic_a1();
        pan.on();
        pan.showChannels();
        pan.off();

        System.out.println(pan.heigh);
        System.out.println(pan.weight);
        System.out.println(pan.width);

        Panasonic_a1.test();
    }

}
