package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyChekedCollection {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        Collection chkList = Collections.checkedCollection(myList, String.class);
        System.out.println("Checked list contetnt: "+chkList);
        myList.add(10);
        chkList.add(10);

    }
}
