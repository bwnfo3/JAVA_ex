package ch6.Overloading;

public class Ex6_6 {
    static double getDistance(int x,int y, int x1, int y1) {
        double powSum = Math.pow(Math.abs(x1 - x),2) + Math.pow(Math.abs(y1 - y),2);
        return Math.sqrt(powSum);
    }
    public static void main(String[] args) {
        System.out.println(getDistance(2,2,1,1));
    }
}
