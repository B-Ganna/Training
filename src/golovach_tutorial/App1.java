package golovach_tutorial;


import java.util.ArrayList;
import java.util.List;
//ITERABLE - любой контейнер, в котором есть элементы и их можно перебрать

public class App1 {
    public static void main(String[] args) {

        // TODO: <> - это brilliant-оператор

        List<String> list = new ArrayList<>();
        //предок                //потомок
        // new(+имя класса) - это запуск конструктора, я не имею права указать здесь интерфейс. ТОЛЬКО конкретный класс!!
        // тк. нельзя создать экземпляр интерефейса - у него методы без тела

        System.out.println(list.size());
        System.out.println(list.isEmpty());


    }

    class Person {
        private List<String> phones;

        // здесь можно указать имя интерфейса, тк пользователь в последствии сам разберется, что ему использовать - LinkedList или ArrayList
        // => полиморфность

        public List<String> getPhones() {
            return phones;
        }

        public void setPhones(List<String> phones) {
            this.phones = phones;
        }
    }
}

