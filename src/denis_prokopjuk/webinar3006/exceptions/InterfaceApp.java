package denis_prokopjuk.webinar3006.exceptions;

public class InterfaceApp {
    public static void main(String[] args) {
        Shape shape = getShape(2);
        shape.draw();
        Color color = getColor(2);
        color.сolorInfo();;

    }

    public static Shape getShape(int type) {
        switch (type) {
            case 0:
                return new Line();
            case 1:
                return new Circle();
            case 3:
                return new Rectangle();
            default:
                throw new RuntimeException("Incorrect type " + type);
        }
    }

    public static Color getColor(int type) {
        switch (type) {
            case 0:
                return new Line();
            case 1:
                return new Circle();
            case 3:
                return new Rectangle();
            default:
                throw new RuntimeException("Incorrect type " + type);
        }
    }
}

