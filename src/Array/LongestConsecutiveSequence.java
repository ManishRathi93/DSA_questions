package Array;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {

        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                ++count;
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }

            else {
                count = 1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
