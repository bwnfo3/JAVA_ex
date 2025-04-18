//package ch12;
//import java.util.ArrayList;
//interface Eatable {}
//class Fruit { public String toString() { return "Fruit"; }}
//class Apple extends Fruit { public String toString() { return "Apple"; }}
//class Grape extends Fruit { public String toString() { return "Grape"; }}
//class Toy { public String toString() { return "Toy"; }}
//public class FruitBoxEx1 {
//    public static void main(String[] args) {
//        Box<Fruit> FruitBox = new Box<Fruit>();
//        Box<Apple> AppleBox = new Box<Apple>();
//        Box<Toy> ToyBox = new Box<Toy>();
//
//        FruitBox.add(new Fruit());
//        FruitBox.add(new Apple()); //Fruit의 자손 클래스라 가능
//        FruitBox.add(new Grape()); //Fruit의 자손 클래스라 가능
//
//        AppleBox.add(new Apple());
//        //AppleBox.add(new Fruit()); //조상 클래스는 불가능
//
//        ToyBox.add(new Toy());
//        ToyBox.add(new Toy());
//        //ToyBox.add(new Fruit()); //Box<Toy>에는 Fruit 담기 불가능
//
//        System.out.println(FruitBox);
//        System.out.println(AppleBox);
//        System.out.println(ToyBox);
//
//    }
//}
//class Box<T> {
//    ArrayList<T> list= new ArrayList<>();
//    void add(T item) { list.add(item); }
//    T get(int i) { return list.get(i); }
//    int size() { return list.size(); }
//    public String toString() { return list.toString(); }
//}
//class FruitBox<T extends Fruit & Eatable > extends Box<T> {} //Fruit의 자손 & eatable
