package ch4;
import java.util.Scanner;

public class starEx4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("홀수 정수 입력 > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력한 정수 : " + num);

        for (int i = 1; i <= num; i++) {
            for(int j = 1; j<=num;j++) {
                if(i + j == num+1 || i == j) {
                    System.out.print('*');
                }
                else {
                    System.out.print('_');
                }
            }
            System.out.println(); //줄바꿈
        }

    }
}
