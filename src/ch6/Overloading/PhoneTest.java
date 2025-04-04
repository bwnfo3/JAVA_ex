package ch6.Overloading;
class Phone {
    String color;
    int version;

    Phone(){
        this("white",4);
    }
    Phone(Phone p) { //인스턴스 복사를 위한 생성자
        color = p.color;
        version = p.version;
    }
    Phone(String color, int version) {
        this.color = color;
        this.version = version;
    }
}
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone p2 = new Phone(p);
        System.out.println("p => " + p.color + ", " + p.version);
        System.out.println("p2 => " + p2.color + ", " + p2.version);

        p.color = "black";
        System.out.println("p.color 변경 후");
        System.out.println("p => " + p.color + ", " + p.version);
        System.out.println("p2 => " + p2.color + ", " + p2.version);
    }
}
