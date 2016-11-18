package denis_prokopjuk.webinar7_8.collectionsExampleSet;


public class Dog implements Comparable<Dog> {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Dog o) {
        //return -(age - o.getAge());
        return name.compareTo(getName());
    }

    @Override
    public String toString() {
        return "Dog: {" +
                "name='" + name + '\'' +
                " age=" + age+"}";
    }
}
