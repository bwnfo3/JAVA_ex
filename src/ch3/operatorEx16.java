package ch3;

public class operatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi); //3.141 , 셋째자리까지 출력

//소수점 셋째자리에서 반올림
        double d = 3.141592;
        double mathPi = Math.round(d * 1000) / 1000.0; //Math.round : 소수점 첫째자리에서 반올림해주는 메서드
        double mathPi2 = Math.round(d * 1000) / 1000;
        System.out.println(mathPi); //3.142
        System.out.println(mathPi2); //3.0

//소수점 셋째자리에서 반올림
        shortPi = (int)(pi * 1000 + 0.5) / 1000f;
        System.out.println(shortPi); //3.142

        shortPi = (int)(pi * 100) / 100f;
        System.out.println(shortPi);
    }
}
