package denis_prokopjuk.webinar2506.ex1;


import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.TYPE);

        final Map map = new HashMap();
        //map = new HashMap();
        map.put("Key", new Employee());

        double i = 2.0;
        double y = 1.1;
        double x = i - y;
        System.out.println(x);
        // TODO: внутреннее представление чисел




    }
}
