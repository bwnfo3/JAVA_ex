//package ch9;
//class Point implements Cloneable {
//    int x,y ;
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//    public String toString() {
//        return "x: " + x + ", y: " + y;
//    }
//    public Object clone() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        }
//        catch(CloneNotSupportedException e) {}
//        return obj;
//    }
//}
//public class CloneEx1 {
//    public static void main(String[] args) {
//        Point original = new Point(1, 2);
//        Point clone = (Point)original.clone(); //복제(clone)해서 새로운 객체 생성
//        System.out.println(original);
//        System.out.println(clone);
//        System.out.println(original == clone);
//    }
//}
