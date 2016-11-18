package denis_prokopjuk.webinar3006.exceptions;


public class Line implements Shape, Color {
    @Override
    public void draw() {
        System.out.println("Line.draw");
    }

    @Override
    public void сolorInfo() {
        System.out.println("Line.green");
    }
}
