package ch2;

public class literalEx {
    public static void main(String[] args) {
        int year = 2025;
        final int MAX_VALUE = 100; //상수이름은 모두 대문자로 선언
        System.out.println(MAX_VALUE); //100

        //final int MAX_VALUE = 200; //MAX_VALUE는 상수라서 변경 불가능 -> 에러

    }
}
