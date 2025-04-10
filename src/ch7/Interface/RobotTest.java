package ch7.Interface;
//로봇이 움직이고, 말도 하는 기능
//Movable 인터페이스 → 움직이는 기능
//
//Speakable 인터페이스 → 말하는 기능
//
//Robot 클래스 → 둘 다 구현
public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.move();
    }
}
interface Movable { void move();}
interface Speakable { void speak(); }
class Robot implements Movable, Speakable {
    public void move() { //public을 붙여야 하는 이유 : interface Mvable에 있는 move()가 public abstract void move()이기 때문에 인터페이스에 있는 범위보다 좁게 설정 불가능
        System.out.println("Robot move");
    }
    public void speak() {
        System.out.println("Robot speak");
    }
}
