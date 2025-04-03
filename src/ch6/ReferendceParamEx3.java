package ch6;

public class ReferendceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,5,1,7,5};

        printArr(arr); //arr 출력
        sortArr(arr); //arr 정렬
        printArr(arr); //arr 정렬 후 출력
        System.out.println("배열의 총 합 : " + sumArr(arr));
    }
    static void printArr(int[] arr) {
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }
    static void sortArr(int[] arr) {
        for(int i=0; i<arr.length -1; i++) {
            for(int j=0; j<arr.length -1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = 0;
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    static int sumArr(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
