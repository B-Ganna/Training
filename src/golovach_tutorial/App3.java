package golovach_tutorial;


import java.util.*;

public class App3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set.add("a"));
        System.out.println(set.add("b"));
        System.out.println(set.add("a"));
        System.out.println(set.add("c"));

        System.out.println(set);
        // TODO: Нет понятия "индекс", и доступа по индексу. Элементы должны быть уникальны
        
        Set<String>set2 = new LinkedHashSet<>();
        // TODO: Хранит элементы по порядку добавления



    }

}
