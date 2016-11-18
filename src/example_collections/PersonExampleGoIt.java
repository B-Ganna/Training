package example_collections;


import java.util.ArrayList;
import java.util.List;

public class PersonExampleGoIt {
    public static void main(String[] args) {
        final List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Anna", "B", (byte) 23));
        personsList.add(new Person("Sergey", "Sh", (byte) 51));
        personsList.add(new Person("Timur", "X", (byte) 40));


        personsList
                .stream()
                .map(person -> person.getName())
                .forEach(person -> System.out.println(person));
    }
}
