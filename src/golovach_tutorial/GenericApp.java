package golovach_tutorial;


import java.util.ArrayList;

public class GenericApp {
    public static void main(String[] args) {
        ArrayList<? extends Integer> ref0 = null;
        ArrayList<? extends Number> ref1 = null;
        //ref0=ref1;
        ref1 = ref0;// компиллируется, тк Number принадлежит Integer

        ArrayList<? super Integer> ref2 = null;
        ArrayList<? super Number> ref3 = null;
        ref2 = ref3;
        //ref3 = ref2;
    }
}
