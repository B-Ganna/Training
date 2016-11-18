package denis_prokopjuk.webinar7_8.hw_6;


import java.util.ArrayList;
import java.util.Collection;

public class Example {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
