package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSumHashMap(nums,target)));
    }

    public static int[] twoSum(int[] arr,int target){
        int[] ans = new int[2];
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        while(start < end){
            if(arr[start] + arr[end] == target){
                return new int[]{start,end};
            }
            else if(arr[start] + arr[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumHashMap(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            int comp = target - arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
