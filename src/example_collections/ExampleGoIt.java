package example_collections;


import java.util.ArrayList;
import java.util.Arrays;

public class ExampleGoIt {
    public static void main(String[] args) {
        Integer[] intArray = {5, 12, -42};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));
        arrayList.add(100);

        System.out.println("Array list elements: ");
        for (Integer element : arrayList) {
            System.out.println(element);
        }

        System.out.println("Sie of ArrayList: "+arrayList.size());
    }
}
