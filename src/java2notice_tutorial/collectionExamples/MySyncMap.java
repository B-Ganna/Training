package java2notice_tutorial.collectionExamples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MySyncMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> sysMap = Collections.synchronizedMap(map);
        System.out.println("Synchronized map got created...");
    }
}
