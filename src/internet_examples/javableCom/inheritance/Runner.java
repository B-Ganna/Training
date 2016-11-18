package internet_examples.javableCom.inheritance;

public class Runner {
    public static void main(String[] args) {
        Notebook note = new Notebook();
        note.hdd = 50;
        note.ram = 4;
        System.out.println(note.hdd);
        System.out.println(note.ram);

        Computer comp = new Computer();

        note.on();
        note.jobS();
        note.jobB();
        note.off();
    }
}
