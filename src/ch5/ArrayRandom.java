package ch5;

import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력 > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        int[] arr = new int[num];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * num);
            for(int j = 0; j<i; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }
        //임의의 수로 중복되지않게 채우기
        System.out.println(java.util.Arrays.toString(arr));

        //정렬하기
        for(int i = 1; i<arr.length -1; i++){
            for(int j = i - 1; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
