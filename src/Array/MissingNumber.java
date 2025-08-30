package Array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        System.out.println(missingNumberXor(arr,arr.length));
    }

    public static int missingNumber(int[] arr, int k){
        int sum = k * (k + 1) / 2;
        int arrSum = 0;
        for (int num : arr){
            arrSum += num;
        }
        return sum - arrSum;
    }

    public static int missingNumberXor(int[] arr, int k){
        int sum = 0;
        int arrSum = 0;
        for(int i = 0;i <= k;i++){
            sum ^= i;
        }
        for(int num : arr){
            arrSum ^= num;
        }
        return arrSum ^ sum;
    }
}
