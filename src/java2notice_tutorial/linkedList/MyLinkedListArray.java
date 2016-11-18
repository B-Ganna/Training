package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyLinkedListArray {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("Actual LinkedList: " + ll);
        String[] strArr = new String[ll.size()];
        ll.toArray(strArr);
        System.out.println("Created array content: ");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
