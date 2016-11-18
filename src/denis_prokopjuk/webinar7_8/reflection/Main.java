package denis_prokopjuk.webinar7_8.reflection;


import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton.hashCode());
        MySingleton mySingleton1 = MySingleton.getInstance();
        System.out.println(mySingleton1.hashCode());

        Constructor[] constructors = MySingleton.class.getDeclaredConstructors();
        Constructor defaultConstructor = constructors[0];
        System.out.println(constructors.length);
        System.out.println(defaultConstructor);
        defaultConstructor.setAccessible(true);
        //Object res = defaultConstructor.newInstance();
        //System.out.println(res);
        //defaultConstructor.newInstance();

    }
}
