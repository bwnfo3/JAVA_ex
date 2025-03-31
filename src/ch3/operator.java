package ch3;

public class operator {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c  = (byte)(a + b);

        System.out.println(c);

        int d = 1_000_000;
        int e = 2_000_000;
        long f = d * e;
        System.out.println(f); //-1454759936
        //int와 int의 연산으로 되어서 오버플로우 발생

        long f2 = (long)d * e; //long과 int의 연산
        System.out.println(f2); //2000000000000

    }
}
