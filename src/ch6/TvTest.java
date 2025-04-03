package ch6;
class Tv {
    //Tv 속성(멤버변수?)
    String color;
    boolean power;
    int channel;

    //Tv 기능(메서드)
    void power() { power = !power; };
    void channelUp() { channel++; };
    void channelDown() { channel--; };
}
class TvTest {
    public static void main(String[] args) {
        Tv t; //Tv인스턴스를 참조하기 위한 변수 t선언
        t = new Tv(); //Tv인스턴스 생성
        t.channel = 7; //Tv인스턴스의 멤버변수 channel 값을 7로 함
        t.channelDown(); //Tv인스턴스의 메서드 channelDown() 호출
        System.out.println(t.channel); //6
    }
}
