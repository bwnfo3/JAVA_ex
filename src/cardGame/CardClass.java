package cardGame;
import java.util.*;

/* 덱 */
class Deck {
    final static int CARD_COUNT = 52;
    private List<Card> CardList = new ArrayList<>();
    int count = 0;
    Deck() {
        int index = 0;
        for(int i = 0; i < Card.KIND_NUM;i++) {
            for(int j = 0; j < Card.CARD_NUM;j++) {
                CardList.add(new Card(Card.Kind.of(i),j +1));
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
        SPADE(1), DIAMOND(2) , HEART(3), CLOVER(4);

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

    public int compare(Object o1, Object o2) {
        //문양(오름차순) -> 숫자(내림차순)
        if(o1 instanceof Card && o2 instanceof Card) {
            Card c1 = (Card)o1;
            Card c2 = (Card)o2;
            if(c1.kind.getValue() == c2.kind.getValue()) {
                return c2.cardNum - c1.cardNum; //내림차순
            }
            else {
                return c1.kind.getValue() - c2.kind.getValue();
            }
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
    ArrayList<Card> playerCardSet = new ArrayList<>(5); //각 라운드 카드 담을 배열 ? null로 고정

    Player(String nickname) {
        this.nickname = nickname;
    }

    int getRoundScore(){ /* 각 라운드의 카드 점수 얻는 메서드 */ return roundScore;};
    void addVictory() { this.victory++; this.playerMoney ++;}
    void setCard(int i, Card card) { playerCardSet.set(i, card);}
}
