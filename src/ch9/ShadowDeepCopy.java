package ch9;
class Circle implements Cloneable {
    Point p; //원점
    double r; //반지름
    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }
    public Circle shadowCopy() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (CloneNotSupportedException e) {}
        return (Circle)o;
    }
    public Circle deepCopy() {
        Object o = null;
        try {
            o = super.clone();
        }
        catch (CloneNotSupportedException e) {}
        Circle c = (Circle)o;
        c.p = new Point(p.x, p.y);
        return c;
    }
    public String toString() {
        return "p : " + p.toString()+ ", r : " + r;
    }
}
class Point {
    int x,y ;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
public class ShadowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1,2),3);
        Circle c2 = c1.shadowCopy();
        Circle c3 = c2.deepCopy();

        System.out.println("c1 => " +c1.toString());
        System.out.println("c2 => " +c2.toString());
        System.out.println("c3 => " +c3.toString());

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("변경후~~");
        System.out.println("c1 => " +c1.toString());
        System.out.println("c2 => " +c2.toString());
        System.out.println("c3 => " +c3.toString());
    }
}
