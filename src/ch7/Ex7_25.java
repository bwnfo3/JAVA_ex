package ch7;
class Outer {
    static class Inner {
        int iv = 200;
    }
}
public class Ex7_25 {
    public static void main(String[] args) {
        //Outer o = new Outer();
       Outer.Inner i = new Outer.Inner();
        System.out.println(i.iv);
    }
}
