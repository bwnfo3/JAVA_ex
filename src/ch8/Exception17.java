package ch8;

public class Exception17 {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception e) {
            System.out.println("main에서 예외가 처리되었습니다.");
        }
    }
    static void method1() throws Exception {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println("method1에서 예외 처리되었습니다.");
            throw e;
        }
        finally {
            System.out.println("method1의 finally 블럭");
        }
    }
}

