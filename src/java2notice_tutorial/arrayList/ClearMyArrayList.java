package java2notice_tutorial.arrayList;


import java.util.ArrayList;

public class ClearMyArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("random");
        System.out.println("Actual ArrayList: " + arr);
        arr.clear();
        System.out.println("After clear: " + arr);


    }
}
