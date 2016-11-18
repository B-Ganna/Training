package example_exception;


public class Example {
    public static void main(String[] args) {
        try {
            calc();

        } catch (StackOverflowError e) {
            System.out.println("rec");
        } catch (OutOfMemoryError e) {
            System.out.println("memory");
        }
    }

    public static void calc() {
        int x = 0;
        try {
            x = f(888);
        } catch (TooLittleException e) {
            System.err.println("little: " + x);
        } catch (TooBigException e) {
            System.err.println("big: " + x);
        }
        System.err.println("ok: " + x);
    }


    private static int f(int k) {
        if (k < -1000) {
            throw new TooLittleException();
        } else if (k > 1000) {
            throw new TooBigException();
        }
        if (k == 888) {
            throw new OutOfMemoryError();
        }
        return 2 * k;
    }
}

