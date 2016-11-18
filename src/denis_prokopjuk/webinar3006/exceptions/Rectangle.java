package denis_prokopjuk.webinar3006.exceptions;


public class Rectangle implements Shape, Color {


    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }

    @Override
    public void сolorInfo() {
        System.out.println("Rectangle.blue");
    }
}
