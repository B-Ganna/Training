package denis_prokopjuk.webinar2506.ex7;

public class App7 {
    public static void main(String[] args) {
        int t = 1;
        switch (t) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        }

        String str="A";
        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("default");
                break;
        }

        MyDayOfWeek myd = MyDayOfWeek.WED;
        switch(myd){
            case MONDAY:
                System.out.println("Name-- "+myd.getName()+" Number-- "+myd.getNumber());
                break;

            case TUE:
                System.out.println("Name-- "+myd.getName()+" Number-- "+myd.getNumber());
                break;

            case WED:
                System.out.println("Name-- "+myd.getName()+" Number-- "+myd.getNumber());
                break;
        }
    }



}
