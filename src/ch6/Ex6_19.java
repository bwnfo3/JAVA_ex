package ch6;

public class Ex6_19 {
    public static void change(String str) {
        str += "456";
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);;
        change(str);
        System.out.println(str);
    }
}
