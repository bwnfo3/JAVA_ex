package ch6.Overloading;
class Car {
    String color;
    String gearType;
    int door;

    Car() {} //생성자
    Car(String c, String gt, int d) { //생성자
        color = c;
        gearType = gt;
        door = d;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.gearType = "auto";
        car1.door = 8;

        Car car2 = new Car("red", "auto", 8);
        System.out.println("car1 =>" + car1.color + ", " + car1.gearType + ", " + car1.door);
        System.out.println("car2 =>" + car2.color + ", " + car2.gearType + ", " + car2.door);
    }
}
