package java2notice_tutorial.arrayList;


import java.util.ArrayList;

public class MyBasicArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("JAVA");
        a.add("C++");
        a.add("PERL");
        a.add("PHP");
        System.out.println(a);
        System.out.println("Element at index 1: " + a.get(1));
        System.out.println("Does list contain JAVA?? " + a.contains("JAVA"));
        a.add(2, "PLAY");
        System.out.println(a);
        System.out.println("Is ArrayList empty? " + a.isEmpty());
        System.out.println("Index of PERL is: " + a.indexOf("PERL"));
        System.out.println("Size of ArrayList is: " + a.size());
    }
}
