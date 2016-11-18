package internet_examples;


public class App01 {
    public static void main(String[] args) {
        System.out.println("-------------- 1 -------------");
        int[] a = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = i + 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] a1 = {1, 8, -2, 9, 0, 12, -1, 4, 7, 11, 0, -14, -9};
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] < 0) {
                System.out.print(a1[i] + " ");
            }
        }
        System.out.println();
        System.out.println("-------------- 2 -------------");
        int[] b = new int[10];
        for (int i = 9; i >= 0; i--) {
            b[i] = -i;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        int[] b1 = {-9, 9, 0, 12, -12, 0, -14, 14};
        for (int i = 0; i < b1.length; i++) {
            if (i > 0) {
                System.out.print(b1[i] + " ");
            }
        }

        System.out.println();
        System.out.println("-------------- 3 -------------");
        int[] c = new int[6];
        for (int i = 5; i >= 0; i = i - 2) {
            c[i] = i;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] c1 = {1, 0, 9, 0, 11, -1, 0, 0, 14, 10};
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + " ");
        }

        System.out.println();
        System.out.println("-------------- 4 -------------");
        int[] d = new int[6];
        for (int i = 2; i <= 6; i++) {
            a[i] = i + i;
        }
        for (int i = 0; i < d.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] d1 = {13, 9, 0, 13, -12, 0, -13, 13};
        for (int i = d1.length - 1; i >= 0; i--) {
            if (d1[i] > 0 && i < 7) {
                System.out.print(d1[i] + " ");
            }
        }
        System.out.println();
        System.out.println("-------------- 5 -------------");
        int[] e = new int[8];
        for (int i = 0; i <= 7; i++) {
            e[i] = 4 - i;
        }
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
        int[] e2 = {7, 27, 21, 107, 7, 10, 14, 7, 17};


    }
}
