package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {0,1,-1,999999999,-999999999,5,5,5,2,3,4,10,9,8,42,-42,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 1;i < arr.length;i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

}
