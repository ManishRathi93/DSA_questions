package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int[] arr1 = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(arr1,-294967296));
    }

    static List<List<Integer>> fourSum(int[] nums,int target){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n - 3;i++){
            if(i > 0 && (nums[i] == nums[i - 1])) continue;

            long min1 = (long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            if(min1 > target) break;

            long max1 = (long) nums[i] + nums[n-1] + nums[n-2] + nums[n-3];
            if(max1 < target) continue;

            for(int j = i+1;j < n - 2;j++){
                if(j > i + 1 && (nums[j] == nums[j - 1])) continue;

                long min2 = (long) nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if(min2 > target) break;

                long max2 = (long) nums[i] + nums[j] + nums[n-1] + nums[n-2];
                if(max2 < target) continue;

                int left = j + 1;
                int right = n - 1;

                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        list.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));

                        while(left < right && (nums[left] == nums[left + 1])) left++;
                        while(left < right && (nums[right] == nums[right - 1])) right--;

                        left++;
                        right--;
                    }
                    else if(sum > target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
