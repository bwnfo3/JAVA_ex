package ch6;
class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1) {
        int x = this.x;
        int y = this.y;

        double powSum = Math.pow(Math.abs(x1 - x),2) + Math.pow(Math.abs(y1 - y),2);
        return Math.sqrt(powSum);
    }

}
public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2,2));
    }
}
