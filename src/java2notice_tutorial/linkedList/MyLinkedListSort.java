package java2notice_tutorial.linkedList;

import java2notice_tutorial.arrayList.Empl;
import java2notice_tutorial.arrayList.MySalaryComp;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListSort {
    public static void main(String[] args) {
        LinkedList<Empl> list = new LinkedList<>();
        list.add(new Empl("Ram", 3000));
        list.add(new Empl("John", 6000));
        list.add(new Empl("Crish", 2000));
        list.add(new Empl("Tom", 2400));
        Collections.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for (Empl em : list) {
            System.out.println(em);
        }
    }
}
