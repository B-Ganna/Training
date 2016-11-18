package denis_prokopjuk.webinar2506.ex1;


public class Employee {

    // TODO: final - это запрет на наследование. Применяется к классу, полю, методу.

    public final String TYPE = "BOSS";//инициализация в строке

    // TODO: final в переменной - это невозможность изменить ее в будущем
    //final переменнная ОБЯЗАТЕЛЬНО должна быть инициализирована! (с строке, блоке инициализации, в конструкторе)

    public final String NAME_TYPE;
    public final String NAME_CLASS;

    {
        NAME_TYPE = "a";//инициализация в блоке
    }

    public Employee() {
        NAME_CLASS = "b";//инициализация в конструкторе
    }

    public void validate() {
        System.out.println("Employee.validate");
    }
}
