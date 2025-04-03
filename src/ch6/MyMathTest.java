package ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath(); //MyMath클래스 타입의 참조변수 mm생성 , MyMath인스턴스 주소값 저장
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        //long a(5L)와 long b(3L)값이 자동으로 double형 값으로 변환되어 호출됨

        System.out.println(result1); //8
        System.out.println(result2); //2
        System.out.println(result3); //15
        System.out.println(result4); //1.6666666666666667
    }
}
class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}

