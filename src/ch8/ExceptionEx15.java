package ch8;
import java.io.*;
public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + "파일이 생성!");
    }
    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다");
            }
        }
        catch (Exception e) {
            fileName = "저목없음.txt";
        }
        finally {
            File f = new File(fileName);
            createFile(f);
            return f;
        }
    }
    static void createFile(File f) {
        try {
            createFile(f);
        }
        catch(Exception e) {}
    }

}
