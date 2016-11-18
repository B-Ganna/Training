package denis_prokopjuk.webinar0707.collections2;

public class Main2 {

    private static int div(int numerator, int denominator) {
        if(denominator== 0){
            throw new IllegalArgumentException ("Denominator cannot be zero! "+numerator);
        }
        return numerator / denominator;

    }

    public static void main(String[] args) {
        try {
            System.out.println(div(978455, 5446));
            System.out.println(div(345435465, 66565));
            System.out.println(div(345435465, 0));
            System.out.println(div(65,0));
        } catch (Exception e) {
            System.out.println("Data was wrong: "+e.getMessage());
        }
        System.out.println("done");

    }
}

