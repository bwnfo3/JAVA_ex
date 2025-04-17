package ch11;
import java.util.*;
class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = { 80, 99, 100, 60, 49, 55, 20, 50};
        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }
        System.out.println("50보다 작은 값 : " + set.headSet(50));
        System.out.println("50보다 큰 값 : " + set.tailSet(50));

    }
}
