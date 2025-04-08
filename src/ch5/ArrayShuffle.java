package ch5;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //배열 0~9중 한 값으로 초기화
        for(int i = 0; i<arr.length;i++) {
            arr[i] = i;
        }
        System.out.println(java.util.Arrays.toString(arr));

        //섞기
        for(int j = 0; j<arr.length;j++) {
            int index = (int) (Math.random()*arr.length);
            int tmp = arr[index];
            arr[index] = arr[j];
            arr[j] = tmp;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
