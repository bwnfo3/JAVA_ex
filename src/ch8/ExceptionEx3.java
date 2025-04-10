package ch8;
import java.util.*;
public class ExceptionEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("숫자 입력: ");
            int a = scanner.nextInt(); // 이건 InputMismatchException 가능

            System.out.print("숫자 입력: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("결과: " + result);

        } catch (InputMismatchException e) {
            System.out.println("⚠ 숫자만 입력하세요!"); //숫자를 입력하지 않았을 때의 예외 처리
        } catch (ArithmeticException e) {
            e.printStackTrace(); /*java.lang.ArithmeticException: / by zero
            at ch8.ExceptionEx3.main(ExceptionEx3.java:13) */
            System.out.println(e.getMessage()); // / by zero
            System.out.println("⚠ 0으로 나눌 수 없습니다!");
        } catch (Exception e) {
            System.out.println("⚠ 예기치 못한 오류 발생: " + e.getMessage());
        }
    }
}
