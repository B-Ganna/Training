package java2notice_tutorial.sortingAlgorythms;


public class MyInsertedSort {
    public static void main(String[] args) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = doInsertionSort(arr1);
        for (int i : arr1) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input) {
        int temp; // temp = list[i]
        for (int i = 1; i < input.length; i++) { // TODO:  начинаем с первого элемента(не с 0, тк 0й уже отсортирован, его нельзя сортировать)
                                                    // i - переменная для внешнего списка
            for (int j = i; j > 0; j--) { // j = i -1  - переменная для внутреннего списка
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}
