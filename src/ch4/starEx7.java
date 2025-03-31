package ch4;

public class starEx7 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.printf("%s","****");
            for ( int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
