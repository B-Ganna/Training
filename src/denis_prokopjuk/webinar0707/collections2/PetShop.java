package denis_prokopjuk.webinar0707.collections2;




import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PetShop {
    List<Dog> dogs;
    List<Cat> cats;



    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "dogs=" + dogs.size() +
                ", cats=" + cats.size() +
                '}';
    }

    public List<Dog> prepareDogOreder(PetShop petShop, ArrayList<Dog>dogs, Map<String,Integer>orderDog) {

        //ArrayList<Animal> result = new ArrayList<>();
        petShop.getDogs();
        int numberOfDogsToRemove = orderDog.get("dog");

        if (petShop.getDogs().size() < numberOfDogsToRemove) throw new IllegalStateException();
        List<Dog> dogsToRemove = petShop.getDogs().subList(0, numberOfDogsToRemove);
        List<Dog> dogsToStay = petShop.getDogs().subList(numberOfDogsToRemove, dogs.size());
        petShop.setDogs(dogsToStay);
        //result.addAll(dogsToRemove);
        return dogsToRemove;
    }

    public List<Cat> prepareCatOreder(PetShop petShop, ArrayList<Cat>cats, Map<String,Integer>orderCat) {

        petShop.getCats();
        int numberOfCatsToRemove = orderCat.get("Cat");

        if (petShop.getCats().size() < numberOfCatsToRemove) throw new IllegalStateException();
        List<Cat> catsToRemove = petShop.getCats().subList(0, numberOfCatsToRemove);
        List<Dog> catsToStay = petShop.getDogs().subList(numberOfCatsToRemove, dogs.size());
        petShop.setDogs(catsToStay);
        return catsToRemove;
    }



}
