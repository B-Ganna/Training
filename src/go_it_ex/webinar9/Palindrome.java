package go_it_ex.webinar9;


public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "moom";

        //1 вариант
        char[] charArray = palindrome.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        //2 вариант (с builder)
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();
        if (palindrome.equals(builder.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");

        }

    }
}
