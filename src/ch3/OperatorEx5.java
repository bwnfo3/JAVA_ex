package ch3;

public class OperatorEx5 {
    public static void main(String[] args) {
        int sum = 0;
        for ( int i = 1; i <= 20; i++) {
            if(i % 2 == 0 || i % 3 == 0){

            }
            else {
                sum += i;
            }
        }
        System.out.println(sum);
        int total = 0;
        int totalsum = 0;
        for (int j = 1; j <= 10; j++) {
            for(int m = 1; m <=j; m++) {
                total += m;
            }
            System.out.println(total);
        }
        System.out.println(totalsum);

        int m = 0;
        int n = 0;
        for ( m = 1; m <= 6; m++) {
            for ( n = 1; n <= 6; n++) {
                if( m + n == 6){
                    System.out.println(m + "," + n);
                }
            }
        }
    }
}
