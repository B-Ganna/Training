package denis_prokopjuk.webinar2506.ex6;

public enum DaysOfWeek {

    // TODO: от ENUM нельзя отнаследоваться, это набор значений
    //не может быть public конструктора. Только default или private

    MONDAY, TUESDAY, WEDNESDAY;
    private int number;

    DaysOfWeek() {
        System.out.println("Enum.Constructor");
    }

    DaysOfWeek(int number) {
        this.number = number;
        System.out.println("Enum.Constructor.Number" + number); //может быть перегруженный конструктор
    }

    @Override
    public String toString() {
        if (number == 3) {
            System.out.println("This is Wednesday");
        }
        return "My String";
    }
}
