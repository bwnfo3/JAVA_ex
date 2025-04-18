//package ch12;
//import java.util.ArrayList;
//interface Eatable {}
//class Fruit implements Eatable{ public String toString() { return "Fruit"; }}
//class Apple extends Fruit { public String toString() { return "Apple"; }}
//class Grape extends Fruit { public String toString() { return "Grape"; }}
//class Toy { public String toString() { return "Toy"; }}
//public class FruitBoxEx2 {
//    public static void main(String[] args) {
//        FruitBox<Fruit> FruitBox = new FruitBox<Fruit>();
//        FruitBox<Apple> AppleBox = new FruitBox<Apple>();
//        FruitBox<Grape> GrapeBox = new FruitBox<Grape>();
//        //FruitBox<Grape> GrapeBox = new FruitBox<Apple>(); //타임 다름!
//        //FruitBox<Toy> ToyBox = new FruitBox<Toy>(); //에러!
//
//        FruitBox.add(new Fruit());
//        FruitBox.add(new Apple());
//        FruitBox.add(new Grape());
//        AppleBox.add(new Apple());
//        //AppleBox.add(new Grape()); //Grape는 Apple의 자손이 아니라서
//        GrapeBox.add(new Grape());
//
//        System.out.println("FruitBox -> " +FruitBox);
//        System.out.println("AppleBox -> " +AppleBox);
//        System.out.println("GrapeBox -> " +GrapeBox);
//    }
//}
//class Box<T> {
//    ArrayList<T> list= new ArrayList<>();
//    void add(T item) { list.add(item); }
//    T get(int i) { return list.get(i); }
//    int size() { return list.size(); }
//    public String toString() { return list.toString(); }
//}
//class FruitBox<T extends Fruit & Eatable > extends Box<T> {} //Fruit의 자손 & Eatable 인터페이스를 구현해야됨
