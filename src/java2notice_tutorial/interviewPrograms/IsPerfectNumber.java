package java2notice_tutorial.interviewPrograms;

public class IsPerfectNumber {
    public boolean isPerfectNumber(int number) {
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        if (temp == number) {
            System.out.println("It's a perfect number");
            return true;
        } else {
            System.out.println("It's not a perfect number");
            return false;
        }
    }


    public static void main(String[] args) {
        IsPerfectNumber ipn = new IsPerfectNumber();
        System.out.println("Is perfect number? " + ipn.isPerfectNumber(28));
    }
}
