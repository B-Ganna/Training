package golovach_tutorial;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class App5 {
    public static void main(String[] args) {
        Collection<String> A = new HashSet<>(Arrays.asList("1", "2", "3"));
        Collection<String> B = new HashSet<>(Arrays.asList("x", "y", "1"));

        // TODO: пересечение множеств
        //
        //A.retainAll(B);
        //System.out.println(A);
        //System.out.println(B);// B - остался без изменений, тк он - аргумент

        // TODO: объединение множеств
        //A.addAll(B);
        //System.out.println("Объединение множеств: "+A);

        // TODO: вычитание множеств

        //A.remove(B);
        //System.out.println(A);

        // TODO: симметрическая разница
        HashSet<String> copyA = new HashSet<>(A);
        A.removeAll(B);
        B.removeAll(A);
        A.addAll(B);
        System.out.println("Симметрическая разница: " + A);
    }
}
