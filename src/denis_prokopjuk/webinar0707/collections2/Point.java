package denis_prokopjuk.webinar5.webinar6.collections2;



class ColoredPoint {
    protected  int x;
    protected  int y;
    protected String color;


    public ColoredPoint(int x, int y){
        this(x,y,"black");

    }

    public ColoredPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColoredPoint{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public void print() {
        System.out.println("(" + x + " , " + y + ")" + color);
    }
}
