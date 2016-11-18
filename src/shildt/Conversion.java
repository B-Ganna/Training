package shildt;


public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        b = (byte) i;
        System.out.println("int " + i + " to byte: " + b);

        i = (int) d;
        System.out.println("double " + d + " to int: " + i);

        b = (byte) d;
        System.out.println("double " + d + " to byte: " + b);



    }
}
