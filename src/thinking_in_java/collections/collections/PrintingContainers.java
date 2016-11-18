package thinking_in_java.collections.collections;


import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
        // print(fill(new ArrayList<String>()));
        //print(fill(new LinkedList<String>()));
        //print(fill(new HashSet<String>()));
        // print(fill(new TreeSet<String>()));
        //print(fill(new LinkedHashSet<String>()));
        //print(fill(new HashMap<String, String>()));
        //print(fill(new TreeMap<String, String>()));
        //print(fill(new LinkedHashMap<String, String>()));
    }
}
