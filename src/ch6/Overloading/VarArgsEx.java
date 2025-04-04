package ch6.Overloading;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = { "a", "b", "c" };
        System.out.println(concatenate("","100","200","300")); //100200300
        System.out.println(concatenate("-", strArr));//a-b-c-
        System.out.println(concatenate(",", new String[] { "1", "2", "3" })); // 1,2,3,
        System.out.println("[" + concatenate("-", new String[0]) + "]"); //[]
        System.out.println("[" + concatenate(",") + "]"); //[]
    }
    static String concatenate(String delim, String... args) {
        String result = "";
        for(String str : args) {
            result += str;
        }
        return result;
    }
}
