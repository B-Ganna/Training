package java2notice_tutorial.hashSet;


import java.util.HashSet;

public class MyHashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("HashSet content: ");
        System.out.println(hs);
        String[] strArray = new String[hs.size()];
        hs.toArray(strArray);
        System.out.println("Copied Array content: ");
        for (String str : strArray) {
            System.out.println(str);
        }
    }
}
