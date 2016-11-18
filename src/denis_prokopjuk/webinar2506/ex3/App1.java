package denis_prokopjuk.webinar2506.ex3;

public class App1 {
    public static void main(String[] args) {
        Phone a = new Phone();
        Phone b = new Phone();
        System.out.println(a.equals(b));
        a.setName("HTC");
        b.setName("HTC");
        System.out.println(a.equals(b));
        System.out.println("a.HashCode = " + a.hashCode());
        System.out.println("b.HashCode = " + b.hashCode());
        System.out.println("a ==b ==> " + (a == b));
        // TODO: хеш-код - это адрес объекта в памяти
        // новый instance в памяти создается ключевым словом NEW
        //и тогда же присваивается HashCode

        System.out.println("-------------equals--------------");
        String s = "Denis";
        String s1 = "Denis";
        //здесь объект один, с одним хеш-кодом
        String s2 = new String("Denis");
        String s3 = new String("Denis");
        System.out.println(s.equals(s1));
        System.out.println("s.Hash" + s.hashCode());
        System.out.println("s1.Hash" + s1.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println("s1.Hash" + s1.hashCode());
        System.out.println("s2.Hash" + s2.hashCode());

        System.out.println(s2.equals(s3));
        System.out.println("s2.Hash" + s2.hashCode());
        System.out.println("s3.Hash" + s3.hashCode());

        System.out.println("------------- == --------------");

        System.out.println(s == s1);
        System.out.println("s.Hash" + s.hashCode());
        System.out.println("s1.Hash" + s1.hashCode());

        //объект один, но создан по-другому. s2 и s3 созданы ключевым словом new

        System.out.println(s1 == s2);
        System.out.println("s1.Hash" + s1.hashCode());
        System.out.println("s2.Hash" + s2.hashCode());

        System.out.println(s2 == s3);
        System.out.println("s2.Hash" + s2.hashCode());
        System.out.println("s3.Hash" + s3.hashCode());

        System.out.println("-------------------------");
        Phone apple = new Phone();
        apple.setName("Apple");
        Phone android = null;
        //см. метод equals в классе Phone
        System.out.println(apple.equals(new Object()));
        System.out.println(apple.equals(android));
        System.out.println(apple.equals(apple));
        android = new Phone();
        android.setName("Android");
        System.out.println(apple.equals(android));
        android.setName("Apple");
        System.out.println(apple.equals(android));

        // TODO: Picture Test (example)
        System.out.println("----------------Picture Test------------");
        Phone sumsung = new Phone();
        sumsung.setName("Sumsung");
        Phone sumsung1 = new Phone();
        sumsung1.setName("Sumsung");
        Phone sumsung2 = new Phone();
        sumsung2.setName("Sumsung");

        // если у объектов разный хеш-код, то == это то же, что euqals

        System.out.println("sumsung.hashCode --> " + (sumsung.hashCode()));
        System.out.println("sumsung1.hashCode --> " + (sumsung1.hashCode()));
        System.out.println("sumsung2.hashCode --> " + (sumsung2.hashCode()));

        System.out.println("sumsung1 == sumsung2 --> " + (sumsung1 == sumsung2));
        System.out.println("sumsung2 == sumsung1 --> " + (sumsung2 == sumsung1));
        System.out.println("sumsung1 == sumsung1 --> " + (sumsung1 == sumsung1));

        // в классе Phone мы переопределили equals, основываясь на равенство по имени
        System.out.println("sumsung1.equals sumsung2 --> " + (sumsung1.equals(sumsung2)));
        System.out.println("sumsung2.equals sumsung1 --> " + (sumsung2.equals(sumsung1)));
        System.out.println("sumsung1.equals sumsung1 --> " + (sumsung1.equals(sumsung1)));




    }
}
