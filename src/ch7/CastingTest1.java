package ch7;
class Car {
    String color;
    int door;

    void drive() {
        //운전하는 기능
    }
    void stop() {
        //멈추는 기능
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("물뿌리는 기능~~");
    }
}
public class CastingTest1 {
    public static void main(String[] args) {
        Car c = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        c = fe;
        //c.water(); c = (Car)fe; 라서 Car타입의 참조변수로는 water()를 못 불러옴
        fe2 = (FireEngine)c;
        fe2.water();
    }
}
