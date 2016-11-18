package java2notice_tutorial.collectionExamples;


import java.util.*;
import java.util.List;

public class MyCheckedList {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        List chlist = Collections.checkedList(myList, String.class);
        System.out.println("Checked list content: " + chlist);
        myList.add(10);
        chlist.add(10);

    }
}
