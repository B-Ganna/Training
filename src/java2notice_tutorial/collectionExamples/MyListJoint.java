package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListJoint {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        s1.add("apple");
        s1.add("java");
        s1.add("c++");
        s1.add("unix");
        s1.add("airtel");
        List<String> tl = new ArrayList<>();
        tl.add("job");
        tl.add("oracle");
        tl.add("jungle");
        tl.add("cricket");
        boolean isCommon = Collections.disjoint(s1,tl);
        System.out.println("Does not found any common elements");

    }
}
