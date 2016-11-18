package denis_prokopjuk.webinar7_8.hw8;


import java.util.ArrayList;
import java.util.List;

public class RunnerMain {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pit", 3));
        dogs.add(new Dog("Bull", 4));
        dogs.add(new Dog("Bull", 7));
        dogs.add(new Dog("Dog", 2));

        //System.out.println(dogs.get(0).name);

        Dog[] dogsArray = {new Dog("Pit", 3),
                new Dog("Bull", 4)
        };
        System.out.println(dogsArray[0].getName());


    }
}
