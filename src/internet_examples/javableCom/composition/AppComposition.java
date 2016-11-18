package internet_examples.javableCom.composition;


public class AppComposition {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.on();
        nb.job();
        nb.off();
    }

}
