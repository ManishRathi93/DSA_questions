package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,1,-1,999999999,-999999999,5,5,5,2,3,4,10,9,8,42,-42,7};
         bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            int swap = 0;
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }
}
