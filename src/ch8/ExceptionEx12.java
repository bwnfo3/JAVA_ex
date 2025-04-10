package ch8;

import java.io.IOException;

public class ExceptionEx12 {
    public static void main(String[] args) throws IOException {
        method1();
    }
    static void method1() throws IOException{
        method2();
    }
    static void method2() {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println("method2에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
