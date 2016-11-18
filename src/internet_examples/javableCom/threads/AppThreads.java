package internet_examples.javableCom.threads;


public class AppThreads {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();

        MyThread2 mt2 = new MyThread2();
        mt2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("I'm first stream");
            Thread.sleep(100);
        }


    }
}
