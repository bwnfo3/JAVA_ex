package ch9;
class Person {
    long id;
    public boolean equals(Object o) {//equals() 오버라이딩
        if(o instanceof Person) { //매개변수의 유효성 검사
            return id == ((Person)o).id; //Object타입으로 참조해서 Person타입으로 형변환 필요
        }
        else
            return false;
    }
    Person(long id) { //Person 생성자
        this.id = id;
    }
}
public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(900122346L);
        Person p2 = new Person(900122346L);

        if(p1 == p2) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}
