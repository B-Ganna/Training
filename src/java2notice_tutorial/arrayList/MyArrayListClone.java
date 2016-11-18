package java2notice_tutorial.arrayList;


import java.util.ArrayList;

public class MyArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("random");
        System.out.println("Actual ArrayList: " + arr);
        ArrayList<String> copy = (ArrayList<String>) arr.clone();
        System.out.println("Cloned ArrayList: " + copy);
    }
}
