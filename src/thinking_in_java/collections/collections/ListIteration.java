package thinking_in_java.collections.collections;


import thinking_in_java.collections.typeInfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex());
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.println(it.previous());
            System.out.println();
            System.out.println(pets);
        }

    }
}
