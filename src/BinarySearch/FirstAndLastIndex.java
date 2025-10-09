package BinarySearch;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(fistAndLastIndex(arr,1)));
    }
    public static int[] fistAndLastIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        int last = -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                if(first == -1 || mid < first) first = mid;
                if(last == -1 || mid > last) last = mid;

                //left check
                int left = mid - 1;
                while(left >= start && arr[left] == target){
                    first = left;
                    left--;
                }

                //right check
                int right = mid + 1;
                while(right <= end && arr[right] == target){
                    last = right;
                    right++;
                }
                break;
            }
            else if(target < arr[mid]){
                    end = mid - 1;
            }
            else{
                start = mid + 1;
            }


        }
        return new int[] {first,last};
    }
}
