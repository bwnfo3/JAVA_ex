package ch5;

public class Ex5_10 {
    public static void main(String[] args) {
        char [] abcCode = {
                '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'
        };
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";
        //97~122
        for(int i = 0;i < src.length();i++) {
            char ch = src.charAt(i);
            int chn = (int)src.charAt(i);
            //System.out.println(chn);
            if(chn >= 97 && chn <= 122) {
                result += abcCode[chn - 97];
            }
            else if(chn >= 48 && chn <= 57) {
                result += numCode[chn - 48];
            }
            System.out.println(result);
        }
    }
}
