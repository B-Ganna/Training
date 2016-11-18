package internet_examples.javableCom.variables;


public class AppVariables {
    public static void main(String[] args) {
        byte a = 5;

        // TODO: в методах нельзя обращаться к переменной выше, чем она обявлена
        // переменную видно начиная от места ее объявления, и до фигурной скобки (границы метода)

        System.out.println(a);

        MyClass mc = new MyClass();


    }
}
