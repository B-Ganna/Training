package java2notice_tutorial.hashSet;


import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetRead {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
