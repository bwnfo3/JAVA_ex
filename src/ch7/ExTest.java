package ch7;
//색깔이 각각 다른(빨,노,초,파) 주사위 4개를 주머니에 넣고 그 중 하나 뽑기!
public class ExTest {
    public static void main(String[] args) {
        DiceG d = new DiceG();
//        Dice pickD = d.pick(0);
//        System.out.println(pickD);

        d.suffle();
        Dice pickD = d.pick();
        System.out.println(pickD);
    }
}
class DiceG {
    final int DICE_NUM = 24;
    Dice[] diceArr = new Dice[DICE_NUM];


    DiceG() {
        int i = 0;
        for(int m = Dice.COLOR_MAX; m > 0; m--) {
            for(int n = 0; n < Dice.MAX_DICE_NUM; n++) {
                diceArr[i++] = new Dice(m , n+1);
            }
        }
    }

    void suffle() {
        for(int i = 0; i < diceArr.length; i++) {
            int j = (int)(Math.random() * DICE_NUM);
            Dice tmp = diceArr[i];
            diceArr[i] = diceArr[j];
            diceArr[j] = tmp;
        }
    }
    Dice pick(int index) {
        return diceArr[index];
    }
    Dice pick() {
        int index = (int)(Math.random() * DICE_NUM);
        return diceArr[index];
    }
}
class Dice {
    static final int COLOR_MAX = 4;
    static final int MAX_DICE_NUM = 6;

    static final int RED = 4;
    static final int YELLOW = 3;
    static final int GREEN = 2;
    static final int BLUE = 1;

    int color_num;
    int diceNum;

    Dice() {
        this(RED, 1);
    }

    Dice(int color_num, int diceNum) {
        this.color_num = color_num;
        this.diceNum = diceNum;
    }
    public String toString() {
        String[] colors = {"", "BLUE", "GREEN", "YELLOW", "RED"};
        String numbers = "0123456";
        return "색깔 : " + colors[this.color_num] + ", number : " + numbers.charAt(this.diceNum);
    }
}
