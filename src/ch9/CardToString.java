package ch9;
final class Card {
    String kind;
    int num;

    Card() {
        this("SPADE",1);
    }
    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }
    public String toString() {
        return "종류 : " + kind + ", 숫자 : " + num;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card("heart",1);
        Card c2 = new Card("diamond",7);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
