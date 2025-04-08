package ch5;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88 , 100, 89 , 90};
        for(int i = 0;i<score.length; i++) {
            sum += score[i];
        }
        average = (float)sum / score.length;

        System.out.println("총점 : "+ sum);
        System.out.println("평균 : "+ average);

        //총점 : 467
        //평균 : 93.4
    }
}
