package ch7;
class Product2 {
    int price;
    int bonusPoint;
    Product2(int price, int bonusPoint) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}
class Tv2 extends Product2 {
    Tv2() {super(0,0);}
    public String toString() {
        return "TV2";
    }
}
public class Ex7_5 {
    public static void main(String[] args) {
        Tv2 t = new Tv2();
    }
}
