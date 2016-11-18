package denis_prokopjuk.webinar7_8.hw_6;



import java.util.*;

abstract class Animal {

    public abstract String getType();

    @Override
    public String toString() {
        return "Animal (" + getType() + ")";
    }
}

class Dog extends Animal {
    @Override
    public String getType() {
        return "dog";
    }
}

class Cat extends Animal {
    @Override
    public String getType() {
        return "Cat";
    }
}


class PetShop {

    List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }


    @Override
    public String toString() {
        return "PetShop{" +
                "animals=" + animals +
                '}';
    }
}

public class Runner {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        ArrayList<Animal> animals = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            animals.add(new Dog());
        }
        for (int i = 0; i < 4; i++) {
            animals.add(new Cat());
        }
        shop.setAnimals(animals);

        Map<String, Integer> order = new HashMap<>();
        order.put("dog", 2);
        order.put("cat", 3);

        System.out.println(shop);

        try {
            List<Animal> animalsToBeRemoved = prepareListOfAnimalsToRemove(shop, order);
            removeAnimalsFromShop(shop, order);
            System.out.println("Order: " + animalsToBeRemoved);
        } catch (Exception e) {
            System.out.println("Exception happened: " + e.getMessage());
        }

        System.out.println(shop);


    }

    private static List<Animal> prepareListOfAnimalsToRemove(PetShop petShop, Map<String, Integer> order) {
        List<Animal> result = new ArrayList<>();
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String animalType = orderEntry.getKey();
            Integer numberOfAmimalsToBeRemoved = orderEntry.getValue();
            int numberOfAnimalsRemoved = 0;
            for (Animal animal : petShop.getAnimals()) {
                if (animalShouldBePreparedForRemoval(animalType, numberOfAmimalsToBeRemoved, numberOfAnimalsRemoved, animal)) {
                    result.add(animal);
                    numberOfAnimalsRemoved++;
                }
            }
            if (notAllAnimalsOfCurrentTypePreparedForRemoval(numberOfAmimalsToBeRemoved, numberOfAnimalsRemoved)) {
                throw new IllegalArgumentException("Shop doesn't have enough " + animalType + "s");
            }
        }
        return result;
    }


    private static boolean animalShouldBePreparedForRemoval(String currentAnimalType, Integer numberOfAmimalsToBeRemoved, int numberOfAnimalsRemoved, Animal animal) {
        return needMoreAnimalIsOfCurrentType(currentAnimalType, animal) && notAllAnimalsOfCurrentTypePreparedForRemoval(numberOfAmimalsToBeRemoved, numberOfAnimalsRemoved);
    }

    private static boolean notAllAnimalsOfCurrentTypePreparedForRemoval(Integer numberOfAmimalsToBeRemoved, int numberOfAnimalsRemoved) {
        return numberOfAmimalsToBeRemoved > numberOfAnimalsRemoved;
    }

    private static boolean needMoreAnimalIsOfCurrentType(String animalType, Animal animal) {
        return animal.getType().equals(animalType);
    }


    private static void removeAnimalsFromShop(PetShop petShop, Map<String, Integer> order) {
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String animalType = orderEntry.getKey();
            Integer numberOfAnimalsToBeRemoved = orderEntry.getValue();
            int numberOfAnimalsRemoved = 0;
            Iterator<Animal> iterator = petShop.getAnimals().iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                if (animalShouldBePreparedForRemoval(animalType, numberOfAnimalsToBeRemoved, numberOfAnimalsRemoved, animal)) {
                    iterator.remove();
                    numberOfAnimalsRemoved++;

                }


            }

        }
    }
}
