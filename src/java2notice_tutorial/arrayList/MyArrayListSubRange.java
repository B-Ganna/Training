package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange {
    public static void main(String[] args) {
        ArrayList<String>arr1 = new ArrayList<>();
        arr1.add("first");
        arr1.add("second");
        arr1.add("third");
        arr1.add("random");
        arr1.add("click");
        System.out.println("Actual ArrayList: "+arr1);
        List<String>list = arr1.subList(2,4);
        System.out.println("Sub list: "+list);

    }

}
