package denis_prokopjuk.webinar2506.ex7;


public enum MyDayOfWeek {
    MONDAY("MONDAY",1), TUE("T",2), WED("W",3);
    private String name;
    private int number;

    MyDayOfWeek(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
