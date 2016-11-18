package denis_prokopjuk.webinar0707.immutable;


public class PersonApp {
    public static void main(String[] args) {
        Person p = new Person("Jack",42);
        System.out.println(p);
        p.setName("Denis");
        p.setAge(54);
        System.out.println(p);

        //// TODO: immutable - объект, чье состояние нельзя изменить после создания

        Employee em = new Employee("Jack",42);
        System.out.println(em);

        String s = "abc";
        String res = s.replaceAll("a","Q");
        System.out.println(s);
        System.out.println(res);

    }

}
