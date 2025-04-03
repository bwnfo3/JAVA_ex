package ch6;
class Data1 {
    int value; //생성자가 0개라서 자동으로 컴파일러가 생성
}
class Data2 {
    int value;
    Data2(int x) { //매개변수가 있는 생성자 , 생성자가 있어서 컴파일러가 자동생성 x
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); //new Data1() ==> 생성자 호출
        //Data2 d2 = new Data2(); //기본 생성자가 추가되지 않아서 에러발생
    }
}
