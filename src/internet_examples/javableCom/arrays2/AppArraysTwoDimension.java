package internet_examples.javableCom.arrays2;


public class AppArraysTwoDimension {
    public static void main(String[] args) {
        byte[] a = new byte[3];
        a[0] = 12;
        a[1] = 13;
        a[2] = 14;
        System.out.println(a[0] + "\n");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        byte[][] two = new byte[3][3];
        two[0][0] = 1;
        two[0][1] = 2;
        two[0][2] = 3;
        two[1][0] = 4;
        two[1][1] = 5;
        two[1][2] = 6;
        two[2][0] = 7;
        two[2][1] = 8;
        two[2][2] = 9;

        System.out.println("\n" + two[1][0]);
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two.length; j++) {
                System.out.print(two[i][j] + " ");
            }
        }

        byte[][] three = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13}};
        System.out.println("\n" + three[0][0]);

    }
}
