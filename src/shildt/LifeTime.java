package shildt;


public class LifeTime {
    public static void main(String[] args) {
        int x = 3;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y = " + y);
            y = 100;
            System.out.println("Now y = " + y);
        }
    }
}
