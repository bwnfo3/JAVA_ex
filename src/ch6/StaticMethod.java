package ch6;
class StaticM {
    int x,y;
    static void staticM() {
        System.out.println("staticM");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        StaticM.staticM();
    }
}
