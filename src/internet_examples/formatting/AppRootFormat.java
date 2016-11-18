package internet_examples.formatting;


import java.util.Locale;

public class AppRootFormat {
    public static void main(String[] args) {
        Integer i = 675;
        double root;
        root = Math.sqrt(i);
        System.out.println("Root of number " + i + " is" + root);
        System.out.printf("Root of number %d is %f", i, root);
        System.out.printf("\n" + "Root of number %d is %.2f", i, root);

        System.out.printf(Locale.UK, "\n" + "%d", 7845);
        System.out.printf("\n" + "%7d", 7845);
        System.out.printf("\n" + "%07d", 7845);
        System.out.printf("\n" + "%-7d", 7845);

        System.out.printf("\n" + "%f", Math.E);
        System.out.printf("\n" + "%10f", Math.E);
        System.out.printf("\n" + "%010f", Math.E);
        System.out.printf(Locale.ENGLISH, "\n" + "%+010f", Math.E);
        System.out.printf("\n" + "%.15f", Math.E);
        System.out.printf("\n" + "%8.3f", Math.E);
        System.out.printf("\n" + "%-8.3f", Math.E);

        System.out.printf("\n" + "%s%n", "Hello");
        System.out.printf("\n" + "%s%n", "Hello");
        System.out.printf("\n" + "%10s%n", "Hello");
        System.out.printf("\n" + "%-10s%n", "Hello");
        System.out.printf("\n" + "%.3s%n", "Hello");
        System.out.printf("\n" + "%8.3s%n", "Hello");

    }

}
