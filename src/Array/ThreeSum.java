package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution(nums));
    }

    static List<List<Integer>> solution(int[] nums){
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0;i < n - 2;i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = nums[i] + nums[right] + nums[left];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    //skip duplicates from left
                    while(left < right && nums[left] == nums[left + 1]) left++;

                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return list;
    }
}
