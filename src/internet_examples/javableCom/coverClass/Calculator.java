package internet_examples.javableCom.coverClass;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        //System.out.println(Byte.MAX_VALUE);
        //System.out.println(Byte.MIN_VALUE);

        //Byte b = new Byte((byte) 8);



       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().trim();
        byte a = Byte.parseByte(s1);

        String s = br.readLine().trim();

        String s2 = br.readLine().trim();
        byte b = Byte.parseByte(s2);

        switch (s) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Agrument is not correct!!!");
                break;
        }


    }
}
