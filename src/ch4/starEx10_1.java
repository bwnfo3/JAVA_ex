package ch4;
import java.util.*;
public class starEx10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("홀수 정수 입력 > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력한 정수 : " + num);

        for (int i = 1; i <= num; i++) {
            int x = i;
            //가장 중간 줄일 때
            if ( i == num / 2 + 1) {
                for( int j = 0; j < num; j ++) {
                    System.out.print('*');
                }
            }
            //나머지
            else {
                //세로 기준 중간 아래 줄 (대칭으로 하려고)
                if ( i >= num / 2 + 1) {
                    x = num - i + 1;
                }

                for (int a = 0; a < x ; a++) {
                    System.out.print('*');
                }
                for (int b = 0; b < num - 2 * x; b++) {
                    System.out.print('_');
                }
                for (int a = 0; a < x ; a++) {
                    System.out.print('*');
                }
            }
            System.out.println(); //줄바꿈
        }
    }
}
