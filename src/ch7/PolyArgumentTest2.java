package ch7;
class Product {
    int price;
    int bonusPoint;
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}
class Desk extends Product {
    Desk() {
        super(100);
    }
    public String toString() { return "Desk";}
}
class Computer extends Product {
    Computer() {super(200);}
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50);}
    public String toString() { return "Audio";}
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 구매를 할 수 없습니다");
            return;
        }
        item[i] = p;
        i++;
        System.out.println(p+"을/를 구매하였습니다.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";
        for(int i = 0; i < item.length; i++) {
            if(item[i] == null) { break;}
            sum += item[i].price ;
            itemList += item[i].toString() + ", ";
        }
        System.out.println("구매한 물품의 총 금액 : " + sum);
        System.out.println("구매한 물품 리스트 : " + itemList);
    }
}
public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Desk());
        b.buy(new Computer());
        b.buy(new Audio());

        b.summary();
    }
}
