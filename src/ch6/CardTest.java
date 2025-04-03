package ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width : " + Card.width + " , Card.height : " + Card.height);//Card.width : 100 , Card.height : 200

        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 1;

        //인스턴스 변수 값 변경
        Card c2 = new Card();
        c2.kind = "diamond";
        c2.number = 6;

        System.out.println("c1.kind : " + c1.kind + " ,  c1.number : " + c1.number); //c1.kind : heart ,  c1.number : 1
        System.out.println("c2.kind : " + c2.kind + " ,  c2.number : " + c2.number); //c2.kind : diamond ,  c2.number : 6

        //클래스변수 변경
        c1.width = 60;
        c1.height = 80;
        System.out.println("c1.width : " + c1.width + " ,  c1.height : " + c1.height);
        System.out.println("c2.width : " + c2.width + " ,  c2.height : " + c2.height);
    }
}
class Card {
    String kind ;
    int number;
    static int width = 100;
    static int height = 200;
}
