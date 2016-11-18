package golovach_tutorial.procedual;


import java.util.Arrays;

public class AppSwap {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            conditionalSwap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void conditionalSwap(int[] data, int frst, int scnd) {
        int tmp = data[frst];
        data[frst] = data[scnd];
        data[scnd] = tmp;
    }
}
