package ch6;

class TvC { String color;}
public class ReferenceParamEx {
    public static void main(String[] args) {
        TvC t = new TvC();
        t.color = "red";
        System.out.println("main() : color = " + t.color);

        changeColor(t);
        System.out.println("AfterChange");
        System.out.println("main() : color = " + t.color);
    }
    static void changeColor(TvC t) {
        t.color = "blue";
        System.out.println("change() : color = " + t.color);
    }

    /* 출력결과
    main() : color = red
    change() : color = blue
    AfterChange
    main() : color = blue
     */
}
