package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("random");
        Iterator<String> itr = arr.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
