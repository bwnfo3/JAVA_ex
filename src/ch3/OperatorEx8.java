package ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;
        System.out.println(c); //-1454759936
        //int타입으로 연산, 범위를 넘어가서 오버플로우 발생!

        c = (long)a * b;
        System.out.println(c); //2000000000000
    }
}
