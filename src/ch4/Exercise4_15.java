package ch4;

public class Exercise4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result = 0; //변수 number를 거꾸로 벼놘해서 담을 변수

        while(tmp != 0) {
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
            System.out.println(result);
        }
        if(number == result) {
            System.out.println("회문수");
        }
        else {
            System.out.println("회문수 x");
        }

        int num = 345;
        System.out.println(num/100*100);
    }
}
