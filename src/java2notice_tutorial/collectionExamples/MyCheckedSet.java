package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyCheckedSet {
    public static void main(String[] args) {
        Set mySet = new HashSet();
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("four");
        Set chkSet = Collections.checkedSet(mySet, String.class);
        System.out.println("Checked set content: " + chkSet);
        mySet.add(10);
        chkSet.add(10);
    }
}
