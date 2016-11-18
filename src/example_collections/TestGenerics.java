package example_collections;


public class TestGenerics {
    public static void main(String[] args) {
        WithVersion<String> strV = new WithVersion<String>("Mike", 10);
        WithVersion<int[]> intArrV = new WithVersion<>(new int[]{10, 20}, 10);
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