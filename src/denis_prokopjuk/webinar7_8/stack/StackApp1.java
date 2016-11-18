package denis_prokopjuk.webinar7_8.stack;


import java.util.Stack;

public class StackApp1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Denis");
        stack.push("Boris");
        stack.push("Pieter");

        System.out.println("-----------");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println("-----------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        for (Object obj : stack) {
            //System.out.println(obj);
        }

    }
}
