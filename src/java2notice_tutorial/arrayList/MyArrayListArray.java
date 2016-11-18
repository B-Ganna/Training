package java2notice_tutorial.arrayList;


import java.util.ArrayList;

public class MyArrayListArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("random");
        System.out.println("Actual ArrayList: " + arr);
        String[] arrStr = new String[arr.size()];
        arr.toArray(arrStr);
        System.out.println("Created Array content: ");
        for (String str : arrStr) {
            System.out.println(str);
        }
    }
}
