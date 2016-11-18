package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySincList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        List<String> sysLi = Collections.synchronizedList(li);
        System.out.println("Synchronized list got created...");
    }
}
