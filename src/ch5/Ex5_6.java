package ch5;

public class Ex5_6 {
    public static void main(String[] args) {
        int[] coinUnit = { 500, 100, 50, 10};

        int money = 2680;
        System.out.println(money);

        for( int i = 0;i<coinUnit.length;i++) {
            int num = money / coinUnit[i];
            System.out.println(coinUnit[i]+"원 : " + num);
            money = money % coinUnit[i];
        }
    }
}
