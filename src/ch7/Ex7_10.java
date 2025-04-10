package ch7;
class MyTv2 {
    private boolean isPower;
    private int channel;
    private int volume;
    private int prevChannel = 0;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    //외부에서 접근할 수 없도록 제어자 붙여야 됨
    //이 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드 추가
    MyTv2() {
        this(false , 0, 0);
    }
    MyTv2(boolean b,int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int channel) {
        this.prevChannel = this.channel;
        this.channel = channel;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    //7_11
    int gotoPrevChannel() {
        this.channel = prevChannel;
        this.prevChannel = channel;
        return channel;
    }
}
public class Ex7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setChannel(20);
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
    }
}
