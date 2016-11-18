package internet_examples.collections;


import java.util.HashMap;
import java.util.Map;

public class AppHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");

        System.out.println(map);

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(20, 567);
        map2.put(19, 78);
        map2.put(18, 100245);

        System.out.println(map2);
    }
}
