package ch7.Abstract;
//추상 클래스 Animal → 공통 속성과 기능 (이름, 잠자기 등)
//인터페이스 Moveable, Eatable → 행동 정의 (움직이기, 먹기)
//개별 동물(Dog, Bird)은 이걸 모두 상속 & 구현
//interface Moveable {
//    void move();
//}
//interface Eatable {
//    void eat();
//}
abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public void sleep(){
        System.out.println(name+"가 자는 중");
    }
    public abstract void eat();
    public abstract void move();
    public abstract void makeSound();
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    public void move() {
        System.out.println(name+"가 네 발로 이동 중");
    }
    public void eat() {
        System.out.println(name+"가 사료를 먹는 중");
    }
    public void makeSound() {
        System.out.println("멍멍!");
    }
}
class Bird extends Animal {
    Bird(String name) {
        super(name);
    }
    public void move() {
        System.out.println(name+"가 하늘을 나는 중");
    }
    public void eat() {
        System.out.println(name+"가 모이를 먹는 중");
    }
    public void makeSound() {
        System.out.println("짹짹!");
    }
}

public class AnimalSoundTest2 {
    public static void main(String[] args){
        Animal d = new Dog("힌둥이");
        Animal b = new Bird("짹쨲이");

        d.eat();
        d.sleep();
        d.makeSound();
        b.eat();
        b.sleep();
        b.makeSound();
    }
}
