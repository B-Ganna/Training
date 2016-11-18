package java2notice_tutorial.collections.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner1 {
    public static void main(String[] args) {
        String removeElem = "Perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Linux");
        myList.add("Oracle");
        myList.add("Unix");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove: ");
        System.out.println(myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (removeElem.equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println("After remove: ");
        System.out.println(myList);
    }
}
