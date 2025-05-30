package cardGame;
import java.util.*;

/* 덱 */
class Deck {
    final static int CARD_COUNT = 52;
    private List<Card> CardList = new ArrayList<>();
    Deck() {
        int index = 0;
        for(int i = Card.KIND_NUM; i > 0;i--) {
            for(int j = 0; j < Card.CARD_NUM;j++) {
                CardList.add(new Card(Card.Kind.of(i-1),j +1));
            }
        }
    }
    //섞기
    public void shuffle() {
        for(int i = 0; i< CardList.size();i++) {
            int tmp = (int)(Math.random() * CARD_COUNT);
            Card tmpCard = (Card)CardList.get(tmp);
            CardList.set(tmp, (Card)CardList.get(i));
            CardList.set(i, tmpCard);
        }
    }
    //덱 출력 (초기화 잘 되었는지 테스트)
    public String toString() {
        String deckStr = "";
        for(Card c : CardList)
            deckStr += c.kind.name() + c.cardNum + ", ";

        return deckStr;
    }
    public Card pick(int i) {
        return (Card)CardList.get(i);
    }
}
/* 카드 */
class Card implements Comparator{
    //멤버변수 : 문양 숫자
    //정렬 기준, 문양 -> 숫자 내림차순 ((예외 13!!!!)
    final static int CARD_NUM = 13;
    final static int KIND_NUM = 4;
    Kind kind;
    int cardNum;
    enum Kind {
        SPADE(4), DIAMOND(3) , HEART(2), CLOVER(1);

        private int value;
        private static Kind[] kindArr = Kind.values();
        Kind(int value) {
            this.value = value;
        }
        int getValue() {
            return this.value;
        }
        static Kind of(int value) {
            return kindArr[value];
        }
    }
    //enum Number {}
    Card() {
        this(Kind.SPADE,1);
    }
    Card(Kind kind, int cardNum) {
        this.kind = kind;
        this.cardNum = cardNum;
    }
    public String toString() {
        return this.kind.name() + this.cardNum;
    }
    public int compare(Object o1, Object o2) {
        //숫자 오름차순
        if(o1 instanceof Card && o2 instanceof Card) {
            Card c1 = (Card)o1;
            Card c2 = (Card)o2;
            return c1.cardNum - c2.cardNum;
        }
        else {
            return -1;
        }
    }
}

/* 플레이어 */
class Player {
    String nickname; //플레이어 이름 (20자 미만)
    private int playerMoney = 10000; //게임 머니(처음 값 : 10000)
    private int victory = 0; //승리 횟수
    private int roundScore = 0; //각 라운드 플레이어 패의
    private ArrayList<Card> playerCardSet = new ArrayList<>(5); //각 라운드 카드 담을 배열 ? null로 고정
    final static int CardSetCapacity = 5;

    Player(String nickname) {
        this.nickname = nickname;
    }

    void addVictory() { this.victory++; this.playerMoney ++;}
    void addCard(int i, Card card) { getPlayerCardList().add(i, card);}
    ArrayList<Card> getPlayerCardList() {
        return this.playerCardSet;
    }

}
