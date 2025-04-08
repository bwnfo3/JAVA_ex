package ch7;
class Card1 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 200;

    Card1(String kind, int number) {
        NUMBER = number;
        KIND = kind;
    }
    Card1() {
        this("HEART",1);
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
public class FinalCardTest {
    public static void main(String[] args) {
        Card1 c = new Card1("HEART", 10);
        //c.NUMBER = 5; 오류 -> NUMBER 변수에 final이 붙어서 값을 바꿀 수 없음
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
