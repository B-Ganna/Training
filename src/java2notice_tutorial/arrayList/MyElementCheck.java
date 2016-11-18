package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.List;

public class MyElementCheck {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("random");
        List<String> list = new ArrayList<>();
        list.add("second");
        list.add("random");
        System.out.println("Does ArrayList contain all list elements? " + arr.containsAll(list));
        list.add("one");
        System.out.println("Does ArrayList contain all list elements? " + arr.containsAll(list));
    }
}
