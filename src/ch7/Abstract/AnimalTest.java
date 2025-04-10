//package ch7.Abstract;
//
//public class AnimalTest {
//    public static void main(String[] args) {
//        Animal d = new Dog();
//        d.breath(); //공통기능
//        d.sound(); //각자 다른 소리
//
//        Animal c = new Cat();
//        c.breath();
//        c.sound();
//    }
//}
//abstract class Animal {
//    void breath() { //공통 메서드
//        System.out.println("breathing!");
//    }
//    //자식 클래스가 반드시 구현해야 하는 메서드
//    abstract void sound();
//}
//class Dog extends Animal {
//    void sound(){
//        System.out.println("멍멍");
//    }
//}
//class Cat extends Animal {
//    void sound(){
//        System.out.println("야옹");
//    }
//}
