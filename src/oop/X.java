package oop;

//todo: 4 области видимости и 3 ключевых слова:

//todo:public - all
//todo:protected - class + package + children
//todo:"package private", "default" - class + package
//todo:private - class

//todo:если предок - private, то наследоваться от него нельзя

class X {
    X(int k) {
        super();                                       //5) но перед этим всем вызыввается констр предка - предок не объявлен, значит это Object
        System.out.println("X(int)");
    }

    X(String s) {
        this(0);                                       //4) вызывает соседний констр с аргументом X - X(int k)
        System.out.println("X(String)");
    } //этот конструктор не приватный, из одного пакета его видно предку
}

class Y extends X {
    public Y() {
        super("");                                     //3) соседний конструктор Y() вызывает конструктор предка со сторокой X(String s)
        System.out.println("Y()");
    }

    public Y(int x, int y) {
        this();                                        //2) Y вызывает соседний конструтор Y()
        System.out.println("Y(int, int)");
    }

}

class Test {
    public static void main(String[] args) {
        new Y(0, 0);                                 // 1) вызываем Y с двумя int
    }
}

