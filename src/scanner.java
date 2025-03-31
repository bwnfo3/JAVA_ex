import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력 > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println(num);
    }
}
