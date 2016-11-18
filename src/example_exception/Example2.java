package example_exception;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    static int f() {
        try {
            throw new Error();
        } finally {
            System.out.println("finally");
            return 1;
        }
    }
}