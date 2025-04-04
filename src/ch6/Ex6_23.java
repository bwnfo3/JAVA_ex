package ch6;

public class Ex6_23 {
    static int max(int[] arr){
        int result = 0;
        if(arr == null || arr.length == 0) {
            result = -999999;
        }
        else {
            for(int i=0;i<arr.length;i++){
                if(result<=arr[i]){
                    result = arr[i];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};

        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : "+max(data));
        System.out.println("최대값 : "+max(null));
        System.out.println("최대값 : "+max(new int[]{}));
    }
}
