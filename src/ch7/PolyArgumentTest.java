//package ch7;
//class Product {
//    int price;
//    int bonusPoint;
//    Product(int price) {
//        this.price = price;
//        this.bonusPoint = (int)(price / 10.0);
//    }
//}
//class Desk extends Product {
//    Desk() {
//        super(100);
//    }
//    public String toString() {
//        return "Desk";
//    }
//}
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//    public String toString() {
//        return "Computer";
//    }
//}
//class Buyer {
//    int money = 1000;
//    int bonusPoint = 0;
//
//    void buy(Product p) {
//        if(money < p.price) {
//            System.out.println("잔액이 부족하여 구매할 수 없습니다.");
//            return;
//        }
//        money = money - p.price;
//        bonusPoint = bonusPoint + p.price;
//        System.out.println(p + "을/를 구매하였습니다.");
//    }
//}
//public class PolyArgumentTest {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Desk());
//        b.buy(new Computer());
//        System.out.println("남은 잔액 : " + b.money + "만원");
//        System.out.println("보너스 포인트 : " +b.bonusPoint);
//    }
//}
