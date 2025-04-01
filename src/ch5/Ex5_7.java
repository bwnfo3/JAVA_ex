package ch5;

public class Ex5_7 {
    public static void main(String[] args) {
        int money = 3510;

        int[] coinUnit = { 500, 100, 50, 10};
        int[] coin = {5,5,5,5};

        for(int i = 0;i<coinUnit.length;i++) {
            int coinNum = 0;
            coinNum = money / coinUnit[i];
            //필요한 코인 숫자가 가진 동전보다 많을 때
            if(coinNum > coin[i]) {
                coinNum = coin[i];
            }
            System.out.println(coinUnit[i] + "원 : " +coinNum);
            coin[i] = coin[i] - coinNum;
            money = money - coinUnit[i] * coinNum;
        }
        if(money > 0) {
            System.out.println("거스름 돈 부족");
            System.exit(0);
        }
        System.out.println("남은 동전의 개수 = ");
        for(int i = 0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i] + "원 :" + coin[i]);
        }
    }
}
