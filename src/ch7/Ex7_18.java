package ch7;

class Ex7_18 {
    static void action(Robot r) {
        if(r == null) {
            System.out.println("로봇이 아닙니다!");
            return;
        }
        else if(r instanceof DanceRobot) {
            ((DanceRobot)r).dance();
        }
        else if(r instanceof SingRobot) {
            ((SingRobot)r).sing();
        }
        else if(r instanceof DrawRobot) {
            ((DrawRobot)r).draw();
        }
    }
    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
        for(int i = 0; i<arr.length; i++) {
            action(arr[i]);
        }
    }
}
class Robot{}
class DanceRobot extends Robot{
    void dance() {
        System.out.println("dancing!");
    }
}
class SingRobot extends Robot{
    void sing() {
        System.out.println("singing!");
    }
}
class DrawRobot extends Robot{
    void draw() {
        System.out.println("drawing!");
    }
}
