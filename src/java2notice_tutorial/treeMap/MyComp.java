package java2notice_tutorial.treeMap;


import java.util.Comparator;

public class MyComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
