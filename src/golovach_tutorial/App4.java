package golovach_tutorial;

// TODO: Два вида полиморфизма: - по типам (subtypes) - через наследование
// TODO:  - параметрический (generics) - полиморфизм без наследования

public class App4 {
    public static void main(String[] args) {
        WithVersion<String> strV = new WithVersion<String>("Mike", 10);
        WithVersion<int[]> intArrV = new WithVersion<>(new int[]{10, 20},10);

    }
}

// TODO: Пример абстракции по значению: (не задаем окончательные значения)

class StringWithVersion {
    private String str;
    private int version;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

class WithVersion<T> {
    private T value;
    private int version;

    public WithVersion(T value, int version) {
        this.value = value;
        this.version = version;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
