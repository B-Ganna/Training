package java2notice_tutorial.treeSet;


import java.util.Comparator;

public class MyStrComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
