package denis_prokopjuk.webinar2306.ex6;


import java.util.Arrays;

public class App6 {
    public static void main(String[] args) {
        App6 app6 = new App6();
        app6.method();
        app6.method(3);
        app6.method(new int[]{1, 2, 3, 4, 5, 6, 7});

        // TODO: метод с VARARKS - последний по приоритетности

    }

    public void method() {
        System.out.println("method()");

    }

    public void method(int a) {
        System.out.println("method(a)" + a);


    }

    public void method1(int[] a) {
        System.out.println("method(a)" + Arrays.toString(a));

    }

    public void method(int... a) {
        /*for (int i=0;i<a.length;i++){
            System.out.println();
        }*/
        System.out.println("method(a)" + Arrays.toString(a));

    }
}
