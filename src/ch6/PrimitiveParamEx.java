package ch6;

class Data { int x;}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        //change메서드가 종료되면서 매개변수 x는 스택에서 제거됨
        System.out.println("AfterChange");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x) { //기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
    /* 출력결과
    main() : x = 10
    change() : x = 1000
    AfterChange
    main() : x = 10
     */
}
