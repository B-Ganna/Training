package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMinNumber {
    public static void main(String[] args) {
        List<Integer>li = new ArrayList<>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        System.out.println("Mininmum element is: "+ Collections.min(li));
    }

}
