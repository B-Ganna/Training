package denis_prokopjuk.webinar0707.collections2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main4 {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();

        ArrayList<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            dogs.add(new Dog());
        }
        petShop.setDogs(dogs);

        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            cats.add(new Cat());
        }
        petShop.setCats(cats);

        System.out.println(petShop);

        Map<String, Integer> order = new HashMap<>();
        order.put("dog", 45);
        order.put("cat", 34);


        int numberOfDogsToRemove = order.get("dog");
        int numberOfCatsToRemove = order.get("Cat");
        List<Dog> dogsToRemove = petShop.prepareDogOreder(petShop, dogs, order);
        List<Cat> catsToRemove = petShop.prepareCatOreder(petShop, cats, order);

        System.out.println("Removed dogs: " + dogsToRemove.size());
        System.out.println("Removed cats: " + catsToRemove.size());

        System.out.println(petShop);
    }

}



