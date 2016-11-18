package denis_prokopjuk.webinar2306.ex4;


public class App4 {
    public static void main(String[] args) {
        /*Car car = new Car();
        System.out.println(car.toString());
        System.out.println(car);

        Bmw bmw = new Bmw();
        System.out.println(bmw);*/

        /*Car car = new Car();
        car.printCarInfo();

        Car car1 = new Bmw();
        car1.printCarInfo();

        Car car2 = new Porsche();
        car2.printCarInfo();*/

        App4 app4 = new App4();
        Car car = app4.getCar(1);
        car.printCarInfo();
    }

    public Car getCar(int type) {
        Car car = null;
        switch (type) {
            case 0:
                car = new Bmw();
                break;
            case 1:
                car = new Porsche();
                break;
            default:
                car = new Car();
        }
        return car;
    }
}
