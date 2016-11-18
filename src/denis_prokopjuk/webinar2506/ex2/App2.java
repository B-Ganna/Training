package denis_prokopjuk.webinar2506.ex2;


import denis_prokopjuk.webinar2306.ex2.Dog;
import denis_prokopjuk.webinar2306.ex4.Car;
import denis_prokopjuk.webinar2506.ex2.pack1.Person;

public class App2 {
    public static void main(String[] args) {

        // TODO: модификаторы доступа
        //private
        //      default
        //          protected  = default + дети
        //              public

        //public ex
        Person p = new Person();

        //protected ex = default + children
        Dog dog = new Dog();
        //если попытаться вызвать myMethod - его даже не видно из папки
        //внутри папки - pack3 - его буде видно другим классами
        //и наследнику - HomeDog - будет видно

        //private
        Car car = new Car();
        //не видны методы никому, даже классам внутри пакета

    }
}
