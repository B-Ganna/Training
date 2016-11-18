package golovach_tutorial.procedual;


public class AppLoop {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            System.out.println(k + " ");
        }

        //увлечичивает на 2
        for (int k = 0; k < 10; k += 2) {
            System.out.println(k + " ");
        }
        for (int k = 9; k >= 0; k--) {
            System.out.println(k + " ");
        }

        for (int k = 9; k >= 0; k -= 2) {
            System.out.println(k + " ");
        }

    }
}
