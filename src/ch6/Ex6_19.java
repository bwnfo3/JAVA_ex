package ch6;

public class Ex6_19 {
    public static String change(String str) {
        str += "456";
        System.out.println("change 내부 : " + str);
        System.out.println(System.identityHashCode(str));
        return str;
    }

    public static void main(String[] args) {
        String str = new String("ABC123");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        change(str);
        System.out.println(str);
    }
}
