package ch4;

public class starEx4_ {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < i%3; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0 ; j < 3-2*i ; j++) {
                System.out.print(" ");
            }
            if(i == 2) {
                System.out.println();
                break;
            }
            System.out.println("*");
        }

    }
}
