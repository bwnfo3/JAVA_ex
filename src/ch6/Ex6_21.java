package ch6;
class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }
    void volumeUp(){
        if(this.volume < MAX_VOLUME){
            volume++;
        }
    }
    void volumeDown(){
        if(this.volume > MIN_VOLUME){
            volume--;
        }
    }
    void channelUp(){
        if(this.channel == MAX_CHANNEL){
            channel = 1;
        }
        else {
            channel++;
        }
    }
    void channelDown(){
        if(this.channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }
        else {
            channel--;
        }
    }
}
public class Ex6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel + ", VOL:"+t.volume);
        System.out.println();

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel + ", VOL:"+t.volume);
        System.out.println();

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        System.out.println();

        t.channel = 1;
        t.channelDown();
        System.out.println("CH:"+t.channel + ", VOL:"+t.volume);
        System.out.println();

        t.channel = 100;
        t.channelUp();
        System.out.println("CH:"+t.channel + ", VOL:"+t.volume);
    }
}
