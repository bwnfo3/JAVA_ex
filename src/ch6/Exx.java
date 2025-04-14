package ch6;

public class Exx {
    static void change(Data3 d) {
        d.value = 100;
    }
    public static void main(String[] args) {
        Data3 d = new Data3(0);

        System.out.println(d.value);
        change(d);
        System.out.println(d.value);
    }
}
class Data3 {
    int value;
    Data3(int v) {
        value = v;
    }
}
