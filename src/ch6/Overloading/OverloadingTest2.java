package ch6.Overloading;

public class OverloadingTest2 {
    public static void main(String[] args) {
        MyMath4 mm4 = new MyMath4();
        System.out.println(mm4.add(3,4));
        System.out.println(mm4.add(3L,4L));
        System.out.println(mm4.add((byte)3,(byte)4));
        System.out.println(mm4.add(3L,4));

    }
}
class MyMath4 {
    long add(int a, int b) { return a+b; }
    long add(long a, long b) { return a+b; }
    int add(byte a, byte b) { return a+b; }
    int add(long a, int b) { return (int)(a+b); }
}
