package ch6;
import java.util.*;
public class ExQ_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열에 담길 숫자의 갯수 입력(홀수) > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        //임의의 개수만큼 배열 생성
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = (int)(Math.random()*10);
            //중복체크 for문
            for(int j = 0; j < i; j++){
                if(arr[j] == arr[i]){
                    i--; //i--로 arr[i]값을 다시 설정
                    break;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
        //
        //배열 정렬
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));

        //가운데 값 출력
        mid(arr);
    }
    static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1;j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static void mid(int[] arr) {
        int index = (int)arr.length/2;
        System.out.println(arr[index]);
    }
}
