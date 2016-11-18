package internet_examples.javableCom.strings;


public class AppStringsEqual {
    public static void main(String[] args) {
        String s = "Hello";
        String s2 = "Hello";
        if (s == s2) {
            System.out.println("s==s2");
        } else if (s != s2) {
            System.out.println("s!=s2");
        }

        if (s.equals(s)) {
            System.out.println("s equals s2");
        } else if (!(s.equals(s2))) {
            System.out.println("s not equals s2");
        }

    }
}
