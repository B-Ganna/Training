package internet_examples.javableCom.composition;


public class Notebook {
    CdRom cdr = new CdRom();
    HDD hdd = new HDD();

    void on() {
        System.out.println("I'm on");
    }

    void job() {
        System.out.println("I'm operating");
        cdr.readDisk();
        hdd.saveInfo();
        cdr.writeDisk();
        hdd.loadInfo();
    }

    void off(){
        System.out.println("I'm off");
    }


}
