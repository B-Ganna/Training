package java2notice_tutorial.interviewPrograms;


import java.util.*;

public class OrderByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        //Collections.sort(list, new Comparator<Map.Entry<String, Integer>);

    }
}
