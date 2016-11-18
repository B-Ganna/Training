package internet_examples.javableCom.methods;


public class Proba3 {
    int a = 10;
    static int cnt = 0;

    public static void print(Proba3 obj) {
        System.out.println("cnt= " + cnt);
        System.out.println("a =" + obj.a);
    }

    public static void main(String[] args) {
        Proba3 obj1 = new Proba3();
        cnt++;
        Proba3.print(obj1);
        Proba3 obj2 = new Proba3();
        cnt++;
        obj2.a = 0;
        print(obj1);
        print(obj2);
    }
}

