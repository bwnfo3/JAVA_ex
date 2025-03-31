package ch3;

public class OpertaorEx7 {
    public static void main(String[] args) {
        char c1 = 'a'; // 'a' 코드값 = 97;
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1; //98
        c3 = (char)(c2 + 1); //b , int로 연산돼서 형변환 해줘야 됨
        c2++; //증감 연산자는 피연산자의 타입을 변경하지 않음 ?
        System.out.println(i);
        System.out.println(c3);
        System.out.println(c2);
        //c2 = c2 + 1; ==> c2 + 1은 int기 때문에 char타입으로 형변환해줘야 됨
        System.out.println(c2);

        //커밋이요
    }
}
