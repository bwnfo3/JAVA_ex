package ch2;

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 92377305;
        float f = (float)i; //i(int)를 float형태로 변환
        int i2 = (int)f; //float -> int로 다시 변환

        double d = (double)i; //i(int) -> double형태로
        int i3 = (int)d; //double -> int로 변환

        float f2 = 1.666f;
        int i4 = (int)f2; //float -> int

        System.out.printf("i = %d%n", i); //i = 92377305
        System.out.printf("f = %f, i2 = %d%n%n", f, i2); //f = 92377304.000000, i2 = 92377304
        System.out.printf("d = %f, i3 = %d%n%n", d, i3); //d = 92377305.000000, i3 = 92377305
        System.out.printf("f2 = %f, i4 = %d%n", f2, i4); //f2 = 1.666000, i4 = 1
    }
}
