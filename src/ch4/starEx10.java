package ch4;

public class starEx10 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if( i == 2) {
                for ( int b = 0; b < 5 ; b++) {
                    System.out.print('*');
                }
            }
            else {
                int y = i ;
                if( i > 2) {
                    //1ㅡ2번째랑 값 같게 만들어줘야됨
                    y = 4 - i;
                }
                for ( int j = 0; j < y + 1; j++) {
                    System.out.print('*');
                }
                for ( int k = 0; k < 3 - 2 * y; k++) {
                    System.out.print('_');
                }
                for ( int l = 0; l < y + 1; l++) {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
