package ch7;
abstract class Unit {
    int x,y ;
    void stop(){};
    abstract void move(int x, int y);
    Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Marin extends Unit {
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marin moving x=" + x + " y=" + y);
    }
    Marin(int x, int y) {
        super(x,y);
    }
    void stimPack(){
        System.out.println("스팀팩!");
    }
}

public class Ex7_17 {
    public static void main(String[] args) {
        Marin mr =  new Marin(10,20);

        mr.stimPack();
        mr.move(30,40);
    }
}
