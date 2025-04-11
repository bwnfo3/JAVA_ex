package ch9;

public class StringEx6 {
    public static void main(String[] args) {
        int a = 100;
        String strA = a + "";

        double b = 200.0;
        String strB = String.valueOf(b);

        double sum = Integer.parseInt(strA) + Double.parseDouble(strB);
        double sum2 = Integer.valueOf(strA) + Double.valueOf(strB);
        System.out.println(strA + " + " + strB + " = " + sum);
        System.out.println(strA + " + " + strB + " = " + sum2);
    }
}
