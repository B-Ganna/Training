package denis_prokopjuk.webinar3006.exceptions;


public class Circle implements Shape, Color {
    @Override
    public void draw() {
        System.out.println("Circle.draw");

    }

    @Override
    public void сolorInfo() {
        System.out.println("Circle.red");

    }
}
