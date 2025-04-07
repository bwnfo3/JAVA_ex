package ch7;
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i = 0; i<CARD_NUM; i++) {
            if(i ==0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard(i+1,true);
            }
            else {
                if(i > 9) {
                    cards[i] = new SutdaCard(i-9,false);
                }
                else {
                    cards[i] = new SutdaCard(i+1,false);
                }
            }
        }
    }
    void shuffle() {
        for(int j = 0; j<CARD_NUM; j++) {
            int k = (int)(Math.random() * CARD_NUM);
            SutdaCard tmp = new SutdaCard();
            tmp= cards[j];
            cards[j] = cards[k];
            cards[k] = tmp;
        }
    }
    SutdaCard pick(int index) {
        return cards[index];
    }
    SutdaCard pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return cards[index];
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num,boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + (isKwang ? "K":"");
    }
}
public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}

