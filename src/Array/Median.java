package Array;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        if((arr1.length + arr2.length) % 2 != 0){
            System.out.println(oddMedian(arr1,arr2));
        }
        else{
            System.out.println(evenMedian(arr1,arr2));
        }

    }
    public static double oddMedian(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0,j = 0, k =0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            merged[k++] = arr1[i++];
        }
        while(j < arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged[((arr1.length + arr2.length) / 2)];
    }

    public static double evenMedian(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0,j = 0, k =0;
        double median;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            merged[k++] = arr1[i++];
        }
        while(j < arr2.length){
            merged[k++] = arr2[j++];
        }
        median = (merged[(merged.length / 2) - 1] + merged[merged.length / 2]) / 2.0;
        return median;
    }
}
