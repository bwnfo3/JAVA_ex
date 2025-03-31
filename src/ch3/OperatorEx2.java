package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1 ; //97 + 1 = 98
        System.out.println(i);

        c3 = (char)(c1 + 1);
        System.out.println(c3);
    }
}
