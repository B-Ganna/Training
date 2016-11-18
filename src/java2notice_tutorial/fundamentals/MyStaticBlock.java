package java2notice_tutorial.fundamentals;


import java.util.ArrayList;
import java.util.List;

public class MyStaticBlock {
    private static List<String> list;

    static {
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }

    public void testList() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        MyStaticBlock msb = new MyStaticBlock();
        msb.testList();
    }

}
