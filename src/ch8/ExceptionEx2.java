package ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        for(int i = 0; i < 10; i++){
            try {
                result = num / (int)(Math.random() * 10); //0~9중 랜덤의 수로 num을 나눔
                System.out.println(result);
            }
            catch (ArithmeticException e){ //result가 0일 경우를 대비
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
    }
}
