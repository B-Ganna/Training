package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShaffle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation: " + "\n");
        for (String str : list) {
            System.out.println(str);
        }

        Collections.shuffle(list);
        System.out.println("Results after shuffle operation: "+"\n");
        for (String str : list) {
            System.out.println(str);
        }

    }
}
