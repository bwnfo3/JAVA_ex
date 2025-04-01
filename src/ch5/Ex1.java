package ch5;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[3];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*9) + 1;
            System.out.println(arr[i]);

        }
    }
}
