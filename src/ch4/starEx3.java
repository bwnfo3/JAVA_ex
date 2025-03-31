package ch4;

public class starEx3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //들어가야하는 빈칸 수 : 5 - i
            for(int j = 1; j < 5 - i; j++) {
                System.out.print("_");
            }
            System.out.print("*");
            System.out.println(); //줄바꿈
        }
    }
}
