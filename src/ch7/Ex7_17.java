package ch7;
class Unit {
    int x,y ;
    void stop(){};
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x+","+y +"로 이동했습니다");
    };
    Unit() { this(0,0);}
    Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Marin extends Unit {
    Marin(){}
    Marin(int x, int y) {
        super(x,y);
    }
    void stimPack(){
        System.out.println("스팀팩!");
    }
}
class Tank extends Unit {
    Tank(){}
    Tank(int x, int y) {
        super(x,y);
    }
    void changeMode() {
        System.out.println("시즈모드!");
    }
}
public class Ex7_17 {
    public static void main(String[] args) {
        Marin mr =  new Marin();

        mr.stimPack();
        mr.move(30,40);

        Tank t = new Tank();
        t.move(20,20);
    }
}
