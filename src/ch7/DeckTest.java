package ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}
class Deck {
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM]; //cardArr[]에 CARD_NUM개의 객체를 담을 배열 생성

    Deck() {
        int i = 0;
        for (int k = Card.KIND_MAX; k > 0; k--) { //4,3,2,1 (문양결정)
            for (int m = 0; m < Card.NUM_MAX; m++) { //카드의 숫자만큼
                cardArr[i++] = new Card(k, m + 1);
            }
        }
    }
    Card pick(int index) {
        return cardArr[index];
    }
    Card pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for(int i = 0; i < CARD_NUM; i++) {
            int j = (int)(Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[j];
            cardArr[j] = temp;
        }
    }
}
class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int HEART = 3;
    static final int DIAMOND = 2;
    static final int CLOVER = 1;
    int kind; //문양
    int number; //숫자

    Card() {
        this(SPADE,1); //섞기 전 카드덱의 첫번째 카드
    }
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
