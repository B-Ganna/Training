package java2notice_tutorial.treeSet;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MyArrayDuplicates {
    public static void main(String[] args) {
        String[] strArr = new String[]{"one", "two", "three", "four", "four", "five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr);
        //create Treeset with List, which elements duplicates
        TreeSet<String> unique = new TreeSet<>(tmpList);
        System.out.println(unique);

    }
}
