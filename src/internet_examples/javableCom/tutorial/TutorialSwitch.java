package internet_examples.javableCom.tutorial;

public class TutorialSwitch {
    public static void main(String[] args) {
        byte a = 1;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
        System.out.println("Hello!");
    }
}
