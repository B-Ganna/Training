package denis_prokopjuk.webinar2306.static1;


public class MyApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Utils utils = new Utils();
        int sum = utils.add(a, b);
        System.out.println(sum);

        int a1 = 4;
        int b1 = 3;
        int substr = Utils.substract(a1, b1);

        //// TODO: при вызове статического метода - НЕ НУЖНО создавать экземпляр класса (и занимать лишнюю память)

        System.out.println(substr);
        String str1 = Utils.myStaticText;

    }
}
