package ch4;

public class starEx9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int y = i ;
            if( i > 2) {
                //1ㅡ2번째랑 값 같게 만들어줘야됨
                y = 4 - i;
            }
            for ( int j = 0; j < y ; j++) {
                System.out.print('_');
            }
            for ( int k = 0; k < 5 - 2 * y; k++) {
                System.out.print('*');
            }
            for ( int l = 0; l < y ; l++) {
                System.out.print('_');
            }
            System.out.println();
        }
    }
}
