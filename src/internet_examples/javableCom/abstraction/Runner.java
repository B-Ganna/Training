package internet_examples.javableCom.abstraction;


public class Runner {
    public static void main(String[] args) {
        T t = new T();
        t.on();
        t.tmc();
        t.off();
        System.out.println("---------------------");

        Acer acer = new Acer();
        acer.on();
        acer.tmc();
        acer.jobB();
        acer.off();
        System.out.println("---------------------");

        PC sms = new Sumsung();
        sms.on();
        sms.tmc();
        sms.modification();
        sms.off();
        System.out.println("---------------------");


    }
}
