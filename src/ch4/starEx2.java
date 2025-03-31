package ch4;

public class starEx2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //들어가야하는 빈칸 수 : i 만큼
            for(int j = 0; j < i; j++) {
               System.out.print("_");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
