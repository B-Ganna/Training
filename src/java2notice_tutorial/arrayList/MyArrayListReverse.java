package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Java");
        arr1.add("Cric");
        arr1.add("Play");
        arr1.add("Watch");
        arr1.add("Glass");
        Collections.reverse(arr1);
        for (String str : arr1) {
            System.out.println(str);
        }

    }
}
