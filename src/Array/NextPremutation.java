package Array;

import java.util.Arrays;

public class NextPremutation {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums){
        int n = nums.length;

        //find pivot
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }

        //if pivot exists
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        // reverse the suffix
        reverse(nums,i + 1,n - 1);

        return nums;

    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right){
            swap(nums,left++,right--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
