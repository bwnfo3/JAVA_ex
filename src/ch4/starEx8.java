package ch4;

public class starEx8 {
    public static void main(String[] args) {
        for( int i = 0; i < 5; i++) {
            //9칸중 왼쪽 빈칸 출력
            for (int j = 0; j < 4 - i; j++) {
                System.out.print('_');
            }

            //*출력
            int z = 2 * i + 1;
            for (int k = 0; k < z; k++) { //k < 6 - i인 이유 : 5 - (i - 1)
                System.out.print('*');
            }

            //9칸중 오른쪽 빈칸 출력
            for (int m = 0; m < 4 - i; m++) {
                System.out.print('_');
            }
            System.out.println();
        }
    }
}
