package Array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            sum += num;
            if(sum > max){
                max = sum;
            }
            else if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
