package java2notice_tutorial.interviewPrograms;


public class MySingleton {
    private static MySingleton myObj;

    static {
        myObj = new MySingleton();
    }

    public MySingleton() {
    }

    private static MySingleton getInstance() {
        return myObj;
    }

    public void testMe() {
        System.out.println("Hey!..It is working..!");
    }

    public static void main(String[] args) {
        MySingleton ms = getInstance();
        ms.testMe();
    }
}
