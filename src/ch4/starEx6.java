package ch4;

public class starEx6 {
    public static void main(String[] args) {
        for( int i = 5; i > 0; i--) {
            //5칸중 빈칸 출력
            for (int j = 0; j < i - 1; j++) {
                System.out.print('_');
            }
            //5칸중 *출력
            for (int k = 0; k < 6 - i; k++) { //k < 6 - i인 이유 : 5 - (i - 1)
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
