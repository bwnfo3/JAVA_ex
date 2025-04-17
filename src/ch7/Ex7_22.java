package ch7;
abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea();
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0, 0);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Circle extends Shape {
    double r;
    /*

    Circle (double r) {
        //this.r = r;
        this (new Point(0,0), r);
    }

    Circle (Point p, double r) {
        super (p);
        this.r = r;
    }
     */
    Circle() {
        this(0);
    }
    Circle(double r) {
        super();
        this.r = r;
    }
    double calcArea() {
        return Math.PI * r * r;
    }
}
class Rectangle extends Shape {
    double width, height;
    Rectangle() {
        this(0,0);
    }
    Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    double calcArea() {
        return width * height;
    }
    boolean isSquare() {
        if(width == height) {
            return true;
        }
        else {
            return false;
        }
    }
}
public class Ex7_22 {
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }
        return sum;
    }
    public static void main(String[] args) {
    Shape[] arr = { new Circle(5.0), new Rectangle(3,4) , new Circle(1)};
        System.out.println("면적의 합 : " + sumArea(arr));
    }
}
