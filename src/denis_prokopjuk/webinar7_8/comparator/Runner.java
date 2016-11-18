package denis_prokopjuk.webinar7_8.comparator;


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pit", 3));
        dogs.add(new Dog("Bull", 4));
        dogs.add(new Dog("Bull", 7));
        dogs.add(new Dog("Dog", 2));

        System.out.println(dogs);
        System.out.println();


        Collections.sort(dogs, (o1, o2) -> {
            int result = o1.getAge() - o2.getAge();
            System.out.println(result);
            return result;
        });
        System.out.println(dogs);
        System.out.println();

        Collections.sort(dogs, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(dogs);

    }
}
