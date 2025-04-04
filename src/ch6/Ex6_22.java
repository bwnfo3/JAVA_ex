package ch6;

public class Ex6_22 {
    static boolean isNumber(String str){
        //48~57
        boolean result = false;
        if( str == null || str.length() == 0 ){
            return result;
        }
        else {
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    result = true;
                }
                else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str ="123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

    }
}

