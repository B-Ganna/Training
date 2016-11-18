package internet_examples.javableCom.methods;


public class Proba2 {
    int a = 10;
    static int cnt = 0;

    public void print() {
        System.out.println("cnt = " + cnt);
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        Proba2 obj1 = new Proba2();
        cnt++;
        obj1.print();
        Proba2 obj2 = new Proba2();
        cnt++;
        obj2.a = 0;
        obj1.print();
        obj2.print();
    }

}
