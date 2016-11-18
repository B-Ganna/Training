package denis_prokopjuk.webinar2506.ex6;


public class App6 {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;

    public static void main(String[] args) {
        DaysOfWeek[] array = DaysOfWeek.values();
        DaysOfWeek wednesday = DaysOfWeek.WEDNESDAY;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println(array[i].ordinal());
            System.out.println(array[i].toString()); //можно переопределить, возвращает любое значене
            System.out.println(array[i].name()); // переопределить нельзя
            System.out.println("-------------------------");
        }
        MONTH[] monthArray = MONTH.values();


    }

    //enum можно объявить внутри класса
    //внутри метода - нельзя

    enum MONTH {
        JAN, FEB, MARCH;
    }
}
