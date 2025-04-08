package ch5;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] score = {79, 88, 100, 89, 96, 86};

        int max = score[0];
        int min = score[0];

        for(int i = 0; i < score.length; i++) {
            if(max < score[i]) {
                max = score[i];
            }
            if(min > score[i]) {
                min = score[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
