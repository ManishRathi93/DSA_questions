package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; //5,6,7,1,2,3,4
        int k = 3;
        reverseArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr,int k){
        if (k > arr.length){
            k = k % arr.length;
        }
        //reverse whole array
        reverse(arr,0,arr.length - 1);

        // reverse first k elements
        reverse(arr,0,k - 1);

        // reverse last elements
        reverse(arr,k,arr.length - 1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
