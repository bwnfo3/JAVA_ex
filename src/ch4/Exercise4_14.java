package ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100) + 1;
        System.out.println(answer);
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt();
            if(input == answer) {
                System.out.printf("맞췄습니다.%n시도횟수는 %d번입니다.", count);
                break;
            }
        }
        while(true);
    }
}
