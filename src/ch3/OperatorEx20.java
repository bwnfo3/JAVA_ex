package ch3;

public class OperatorEx20 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;
        System.out.printf("%d을 %d로 나누면, 몫은 : %d , 나머지는 : %d입니다.", x , y , x/y, x%y);
        //10을 8로 나누면, 몫은 : 1 , 나머지는 : 2입니다.
        System.out.println(10%8); //2
        System.out.println(-10%8); //-2
        System.out.println(-10%-8); //-2

        System.out.println('a' + 'b');
    }
}
