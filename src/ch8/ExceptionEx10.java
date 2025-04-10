package ch8;

public class ExceptionEx10 {
    public static void main(String[] args) {
        try {
            //Exception e = new Exception("고의 예외 Exception 만들기~");
            ArithmeticException ae = new ArithmeticException("고의 예외 ArithmeticExceptio 만들기");

            throw ae;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("ArithmeticExceptio가 아닌 예외 발생");
            e.printStackTrace();
        }
        finally {
            System.out.println("finally는 항상 실행");
        }
    }
}
