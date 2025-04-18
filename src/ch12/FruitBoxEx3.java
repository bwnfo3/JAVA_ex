package ch12;
import java.util.ArrayList;
class Fruit { public String toString() { return "Fruit"; }}
class Apple extends Fruit { public String toString() { return "Apple"; }}
class Grape extends Fruit { public String toString() { return "Grape"; }}
class Juice {
    String name;
    Juice(String name) { this.name = name + " Juice"; }
    public String toString() { return name; }
}
class Juicer {
//    static void makeJuice(FruitBox<? extends Fruit> box) {
//        String tmp = "";
//        for( Fruit f : box.getList() )
//    }
}
public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        //System.out.println(Juicer.makeJuice(fruitBox));
    }
}
class Box<T> {
    ArrayList<T> list= new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
class FruitBox<T extends Fruit> extends Box<T> {} //Fruit의 자손만 제한
