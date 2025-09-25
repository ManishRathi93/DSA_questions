package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {0,1,-1,999999999,-999999999,5,5,5,2,3,4,10,9,8,42,-42,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
