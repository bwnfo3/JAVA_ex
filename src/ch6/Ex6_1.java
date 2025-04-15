package ch6;
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }
    SutdaCard(int n, boolean b) {
        if(n < 1 || n > 10) {
            System.out.println("카드의 숫자가 올바르지 않습니다.");
            return;
        }
        num = n;
        isKwang = b;
    }
    String info(){
        if(isKwang){
            return num + "K";
        }
        else {
            return num + "";
        }
    }
}
public class Ex6_1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(11,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
