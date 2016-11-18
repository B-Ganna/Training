package java2notice_tutorial.treeSet;


import java.util.TreeSet;

public class MyDuplicateEntry {
    public static void main(String[] args) {
        String[] strArr = new String[]{"one", "two", "three", "four", "four", "five"};
        TreeSet<String> unique = new TreeSet<>();
        for (String str : strArr) {
            if (!unique.add(str)) {
                System.out.println("Duplicate entry is: " + str);
            }
        }
    }
}
