package oop;

//todo: при создании объекта, ему выдается хеш-код, который хранится вместе с объектом - причем поле хеш не включено ДО вызова метода
//todo: у объекта есть скрытое поле типа int, в которм лежит хеш-код
//todo: компилятор предварительно вызывает конструктор предка: super();
//todo:                                 или ссылка на предка: super.
//todo:                            вызов моего конструктора: this();
//todo:                                        ссылка на меня: this.
//todo:!! в каждом конструкторе, первой строчкой, идет вызов либо конструктора предка(super), либо соседнего(this)
//todo:SUPER - конструируем предка, THIS - этот конструктор передает часть работы другому конструктору (без аргументов)
//todo: - если не вставил программист, то вставил комп
//todo: КОНСТРУКТОРЫ - полностью идентичны методам, также имеют область видимости и могут бросат исключения. НО ничего не возвращают!!!
//todo: нельзя внутри писать return; декларировать возвращаемый результат
//todo:до вызова констр потомка - должен быть вызван констр предка


public class Example00 {
    static class A extends Object {
        int x;

        A() {

            //super();
            System.out.println("A" + this.hashCode());
            x = 42;
        }

        void f() {
            System.out.println("A.f");
        }
    }

    static class B extends A {
        B() {
            super();
            System.out.println("B" + x);
        }

        void f() {
            System.out.println("B.f");
        }
    }

    static class C extends B {
        C() {
            super();
            System.out.println("C");
        }

        void f() {
            System.out.println("C.f");
        }
    }

    public static void main(String[] args) {
        B ref0 = new C();
        A ref1 = ref0;
        ref1.f();
    }
}
