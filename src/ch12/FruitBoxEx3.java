//package ch12;
//import java.util.ArrayList;
//
//class Fruit { public String toString() { return "Fruit"; }}
//class Apple extends Fruit { public String toString() { return "Apple"; }}
//class Grape extends Fruit { public String toString() { return "Grape"; }}
//
//class Juice {
//    String name;
//    Juice(String name) { this.name = name + " Juice"; }
//    public String toString() { return name; }
//}
//class Juicer {
//    static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
//    //static Juice makeJuice(FruitBox<? extends Fruit> box) {
//        String tmp = "";
//        for( Fruit f : box.getList() ) {
//            tmp += f + " ";
//        }
//        return new Juice(tmp);
//    }
//}
//public class FruitBoxEx3 {
//    public static void main(String[] args) {
//        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//        FruitBox<Apple> appleBox = new FruitBox<Apple>();
//
//        fruitBox.add(new Apple());
//        fruitBox.add(new Grape());
//        appleBox.add(new Apple());
//        appleBox.add(new Apple());
//
//        System.out.println(Juicer.<Fruit>makeJuice(fruitBox));
//        System.out.println(Juicer.<Apple>makeJuice(appleBox));
//    }
//}
//class Box<T> {
//    ArrayList<T> list = new ArrayList<T>();
//    void add(T item) { list.add(item); }
//    T get(int i) { return list.get(i); }
//    ArrayList<T> getList() { return list;}
//    int size() { return list.size(); }
//    public String toString() { return list.toString(); }
//}
//class FruitBox<T extends Fruit> extends Box<T> {} //Fruit의 자손만 제한
