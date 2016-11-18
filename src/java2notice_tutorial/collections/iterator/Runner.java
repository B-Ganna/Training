package java2notice_tutorial.collections.iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String>myList = new ArrayList<>();
        myList.add("Linux");
        myList.add("Oracle");
        myList.add("Unix");
        myList.add("C++");
        myList.add("Perl");
        Iterator<String>iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
