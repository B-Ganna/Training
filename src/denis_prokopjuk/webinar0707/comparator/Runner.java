package denis_prokopjuk.webinar0707.comparator;


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(-1);
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Black", 1000, 1));
        cars.add(new Car("White", 3000, 3));
        cars.add(new Car("Red", 2000, 2));

        System.out.println(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                //return o1.getAge()-o2.getAge();
                return o1.compareTo(o2);
            }
        });
        System.out.println(cars);
        System.out.println("-------------------");
        Set<Car> set = new TreeSet<>();
        set.add(new Car("Black", 1000, 1));
        set.add(new Car("White", 3000, 3));
        set.add(new Car("Red", 2000, 2));
        System.out.println(set);

    }
}
