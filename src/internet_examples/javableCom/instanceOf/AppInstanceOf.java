package internet_examples.javableCom.instanceOf;


public class AppInstanceOf {
    public static void main(String[] args) {
        Object obj = new String();
        if (obj instanceof String) {
            System.out.println("Class string Object");
        } else {
            System.out.println("No");
        }
    }
}
