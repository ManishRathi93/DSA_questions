package Array;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] arr = {1,0,5,3,6};
        System.out.println(function(arr));
    }

    static int function(int[] arr1){
        Arrays.sort(arr1);
        int[] arr = sortDesc(arr1);
        int h = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > i + 1){
                h = i + 1;
            }else {
                break;
            }
        }
        return h;
    }
    static int[] sortDesc(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr1[i] = arr[arr.length - i - 1];
        }
        return arr1;
    }
}
