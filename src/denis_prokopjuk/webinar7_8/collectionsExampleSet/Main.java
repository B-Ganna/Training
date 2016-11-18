package denis_prokopjuk.webinar7_8.collectionsExampleSet;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Denis", 28);
        StudentListener listener = new StudentListener();
        student.addListener(listener);
        System.out.println("1." + student);
        student.setName("Boris");
        System.out.println("2." + student);
        student.setAge(25);
        System.out.println("3." + student);
        System.out.println("---------------------");
        Phone phone = new Phone("HTC");
        phone.addListener(listener);
        phone.setTitle("Apple");


    }
}
