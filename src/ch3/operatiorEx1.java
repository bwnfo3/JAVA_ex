package ch3;

public class operatiorEx1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a + b;
        //연산은 int로 변환되기 때문에 오류
        byte c = (byte)(a + b);

        System.out.println(c);

        int i = 10;
        float f = 1.3f;
        System.out.println( i + f);
    }
}
