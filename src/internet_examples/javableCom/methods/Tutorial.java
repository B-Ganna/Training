package internet_examples.javableCom.methods;


public class Tutorial {
    public static void main(String[] args) {
        Panasonic_a1 panas = new Panasonic_a1();
        panas.weight = 4;
        panas.heigh = 6;
        panas.width = 8;

        System.out.println(panas.weight);
        System.out.println(panas.heigh);
        System.out.println(panas.width);

        panas.on();
        panas.showChannels();
        panas.connectConsol();
        panas.off();

        Panasonic_a1 panas1 = new Panasonic_a1();
        System.out.println(panas1.weight);
        System.out.println(panas1.heigh);
        System.out.println(panas1.width);


    }
}
