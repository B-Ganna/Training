package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("random");
        System.out.println("Actual ArrayList: " + arr);
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        arr.addAll(list);
        System.out.println("After copy: " + arr);
    }
}
