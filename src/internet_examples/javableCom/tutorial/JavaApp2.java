package internet_examples.javableCom.tutorial;


public class JavaApp2 {
    public static void main(String[] args) {
        int i = 190;
        byte b = (byte) i;
        System.out.println(b);

        long c = 120;
        int d = (int) c;
        System.out.println(d);

        byte a2 = 2;
        long c1 = 120;
        long c2 = 130;
        int i2 = (int) (c1 + c2 + a2);
        System.out.println(i2);

        int a3 = 12;
        test((byte) 12);
    }

    static void test(byte a3) {
        System.out.println(a3);
    }
}
