package ch7;

import java.util.Arrays;

public class Ex7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if(p.price > money) {
            System.out.println("잔액이 부족하여 " + p.toString() + "을 살 수 없습니다.");
            return;
        }
        money = money - p.price;
        add(p);
    }
    void add(Product p) {
        if(i>= cart.length) {
            Product[] cartCopy = Arrays.copyOf(cart, cart.length*2);
            cart = cartCopy;
        }
        cart[i++] = p;
    }
    void summary(){
        int sum = 0;
        String pList = "";
        for(i = 0; i < cart.length; i++) {
            if(cart[i] == null) {
                break;
            }
            pList += cart[i].toString() + ", ";
            sum += cart[i].price;
        }
        System.out.println("구입한 목록 :" + pList);
        System.out.println("총 금액 : " + sum);
        System.out.println("남은 금액 : " + money);
    }
}
class Product{
    int price;
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product{
    Tv() { super(100);}
    public String toString() { return "Tv";}
}
class Computer extends Product {
    Computer() { super(200);}
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50);}
    public String toString() { return "Audio";}
}
