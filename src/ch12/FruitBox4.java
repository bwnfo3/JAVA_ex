package ch12;
import java.util.*;
class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + " (" + weight + ")";
    }
}
class Apple extends Fruit {
    Apple(String name, int weight) {
        super(name, weight);
    }
}
class Grape extends Fruit {
    Grape(String name, int weight) {
        super(name, weight);
    }
}
class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2) {
        return f1.weight - f2.weight;
    }
}
class FruitBox4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();

        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 400));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("Grape", 300));
        grapeBox.add(new Grape("Grape", 200));
        grapeBox.add(new Grape("Grape", 500));

        System.out.println(appleBox.getList());
        System.out.println(grapeBox.getList());

        Collections.sort(appleBox.getList(),new FruitComp());
        Collections.sort(grapeBox.getList(),new FruitComp());
        System.out.println(appleBox.getList());
        System.out.println(grapeBox.getList());
    }
}
class FruitBox<T extends Fruit> extends Box<T> {}
class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString();}
}
