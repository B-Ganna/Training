package denis_prokopjuk.webinar2306.ex2;


public class App3 {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        //HomeDog homeDog = new HomeDog();
        // TODO: когда создается instance наследника, то он наследует все блоки и конструкторы родительского класса
        // в момент создания наследника, JVM проходит путь от Object до родителя - до наследника
        // поэтому сначала будут вызваны static-блоки у родителя, потом - у наследника; потом - прочите блоки и конструкторы

        // TODO: слово "new" - вызывает целую цепочку скрытой реализации

        JackHomeDog jack = new JackHomeDog();



    }
}
