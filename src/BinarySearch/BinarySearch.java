package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9,12,23};
        System.out.println(binarySearch(arr,17));
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
