package ch7;
class Parent2 {
    int x = 100;
    Parent2() {
        this(200);
    }
    Parent2(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}
class Child2 extends Parent2 {
    int x = 3000;
    Child2() {
        this(1000);
//        System.out.println("super x :" + super.x);
//        System.out.println("this x :" + this.x);
    }
    Child2(int x) {
        this.x = x;
    }
}
public class Ex7_7 {
    public static void main(String[] args) {
        Child2 ch2 = new Child2();

        System.out.println(ch2.getX());
        System.out.println(ch2.x);
    }
}
