package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyCheckedMap {
    public static void main(String[] args) {
        Map myMap = new HashMap();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("four", 4);
        Map chkMap = Collections.checkedMap(myMap, String.class, Integer.class);
        System.out.println("Checked map content: " + chkMap);
        myMap.put(10, "ten");
        chkMap.put(10, "ten");
    }
}
