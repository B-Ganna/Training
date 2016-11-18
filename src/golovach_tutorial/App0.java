package golovach_tutorial;

import java.util.ArrayList;
import java.util.Collection;

public class App0 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        //todo: list - это ссылка типа Collection, на объект типа ArrayList
        //в момент, когда работает JVM, важен тип ArrayList - именно под него выделяется память
        //НО компиллятор опирается на тип Collection (если у него нет какого-либо метода, то комп-р его не пропустит. даже если такой метод есть у ArrayList)

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println(list.contains("x"));
        System.out.println(list.contains("a"));

        System.out.println(list.remove("xxx"));
        System.out.println(list.remove("a"));

        System.out.println(list);


    }
}
