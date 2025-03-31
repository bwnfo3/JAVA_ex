package ch2;

public class AutoCasting {
    public static void main(String[] args) {
        double d = 1.666f;
        int i = 1;

        System.out.printf("%f + %d = %f", d , i , d+i ); //1.666000 + 1 = 2.666000
        //자동으로 double형태로 변환되어서 계산됨

    }
}
