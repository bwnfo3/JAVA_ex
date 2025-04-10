package ch8;

class FinallyText3 {
    public static void main(String[] args) {
        FinallyText3.method1();
        System.out.println("method1을 마치고 main으로 돌아왔습니당");
    }
    static void method1() {
        try {
            System.out.println("method1 실행!");
            return;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("method1()의 finally블럭 실행!");
        }
    }
}
