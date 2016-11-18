package denis_prokopjuk.webinar2306.ex4;


public class Car {
    String name;
    String color;

    public void printCarInfo() {
        System.out.println("Simple car");

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
