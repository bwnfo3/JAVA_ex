package ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);
        //t.hour = 13; //private라서 접근 불가능
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}
class Time {
    private int hour, minute, second;
    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    int getHour() { return hour; }
    void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    int getMinute() {return minute;}
    void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    int getSecond() {return second;}
    void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
