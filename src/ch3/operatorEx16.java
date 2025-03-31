package ch3;

public class operatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi); //3.141

        shortPi = (int)(pi * 1000 + 0.5) / 1000f;
        System.out.println(shortPi); //소수점 셋째자링서 반올림

        shortPi = (int)(pi * 100) / 100f;
        System.out.println(shortPi);
    }
}
