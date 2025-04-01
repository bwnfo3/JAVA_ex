package ch4;

public class Exercise4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i)<48 || value.charAt(i)>57) {
               isNumber = false;
               break;
            }
        }
        if(isNumber) {
            System.out.println("숫자");
        }
        else {
            System.out.println("숫자 x");
        }
    }
}
