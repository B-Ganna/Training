package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListDisjoint {
    public static void main(String[] args) {
        List<String> sl = new ArrayList<>();
        sl.add("apple");
        sl.add("java");
        sl.add("c++");
        sl.add("unix");
        sl.add("orange");
        sl.add("airtel");
        List<String> tl = new ArrayList<>();
        tl.add("job");
        tl.add("oracle");
        tl.add("jungle");
        tl.add("cricket");
        boolean isCommon = Collections.disjoint(sl, tl);
        System.out.println("Does not found any common elements: " + isCommon);
        tl.add("java");
        isCommon = Collections.disjoint(sl, tl);
        System.out.println("Does not found any comon elemen: " + isCommon);

    }
}
