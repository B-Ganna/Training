package golovach_tutorial.procedual;


public class AppCangeNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("a = " + b);

        //2 способ (работает ТОЛЬКО с целыми числами)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("a = " + b);


    }
}
