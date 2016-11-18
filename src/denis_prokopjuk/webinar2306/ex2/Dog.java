package denis_prokopjuk.webinar2306.ex2;


public class Dog {

    // TODO: ключевое слово STATIC говорит о том, что данное поле/метод - не принадлежит этому классу, и к нему можно обащаться напрямую
    // из любой точки программы
    //не требует создания экземпляра класса

    // TODO: в статическом блоке нельзя инициализировать Нестатическую переменную - можно работать ТОЛЬКО со static переменными
    //в обычных блоках можно использовать и статические, и не статические

    int t;
    static int q;


    static {
        System.out.println("Dog static block1");
        //t++; //не могу вызвать здесь t
        q++;
    }

    {
        System.out.println("\t Dog.block1");
    }

    {
        System.out.println("\t Dog.block2");
    }

    public Dog() {
        System.out.println("\t\t Constructor");
    }

    static {
        System.out.println("Dog static block2");
    }

}
