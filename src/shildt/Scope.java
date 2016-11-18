package shildt;


public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10; // переменная x доступна кода блока if
        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // TODO: // y=100; - переменная y здесь недоступна!!! она доступна только коду блока if
        System.out.println("x = " + x);
    }
}
