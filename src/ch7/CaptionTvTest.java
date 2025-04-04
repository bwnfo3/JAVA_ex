package ch7;

class Tv {
    boolean power;
    int channel;

    void power(){ power = !power;}
    void channelUp(){ ++channel;}
    void channelDown(){ --channel;}
}
class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; //조상 클래스로부터 상속받은 멤버
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World");
        ctv.caption = true; //캡션 기능 킴
        ctv.displayCaption("Hello World");
    }
}
