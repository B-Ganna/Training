package denis_prokopjuk.webinar0707.collections2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);

        int numberOfDogs = 0;
        int numberOfCats = 0;


        for (Animal animal : animals) {
            if (animal.getType().equals("dog")) numberOfDogs++;
            if (animal.getType().equals("Cat")) numberOfCats++;
        }
        System.out.println(numberOfDogs);
        System.out.println(numberOfCats);

        long numberOfDogsJava8 = animals.stream().filter(a -> a instanceof Dog).count();
        long numberOfCatsJava8 = animals.stream().filter(a -> a instanceof Cat).count();
        System.out.println(numberOfDogsJava8);
        System.out.println(numberOfCatsJava8);



        System.out.println(animals);
        int numberOfdogsToRemove = 2;
        List<Animal> result = new ArrayList<>();
        String animalType = "dog";

        try {
            prepareAnimals(animals, 2, result, "dog");
            removeAnimalsFromTheList(animals, 1, "dog");
        } catch (Exception e) {
            System.out.println("exceptions");
        }

        System.out.println(animals);

        System.out.println(numberOfDogs);
        System.out.println(numberOfCats);


    }

    private static void prepareAnimals(List<Animal> animals, int numberOfdogsToRemove, List<Animal> result, String animalType) {
        Iterator<Animal> animalIterator = animals.iterator();
        int numberOfdogsRemoved = 0;


        while (animalIterator.hasNext()) {
            Animal currentAnimal = animalIterator.next();


            if (currentAnimal.getType().equals(animalType) && numberOfdogsRemoved < numberOfdogsToRemove) {
                result.add(currentAnimal);
                animalIterator.remove();
                numberOfdogsRemoved++;
            }
        }
        if (numberOfdogsRemoved < numberOfdogsToRemove) throw new IllegalStateException("Not enough dogs");
    }

    private static void removeAnimalsFromTheList(List<Animal> animals, int numberOfdogsToRemove, String animalType) {
        Iterator<Animal> animalIterator = animals.iterator();
        int numberOfdogsRemoved = 0;


        while (animalIterator.hasNext()) {
            Animal currentAnimal = animalIterator.next();


            if (currentAnimal.getType().equals(animalType) && numberOfdogsRemoved < numberOfdogsToRemove) {
                animalIterator.remove();
                numberOfdogsRemoved++;
            }
        }
        if (numberOfdogsRemoved < numberOfdogsToRemove) throw new IllegalStateException("Not enough dogs");
    }

}
