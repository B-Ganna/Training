package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");

        Collections.swap(list, 2, 5);
        System.out.println("Results after swap operation: ");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
