package Array;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValueByTwo {
    public static void main(String[] args) {
        int[] nums = {5,3,1,12,6};
        int k = 3;
        Long startTime = System.currentTimeMillis();
        System.out.println(solution(nums,k));
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " s");

        Long startTimeSet = System.currentTimeMillis();
        System.out.println(solution1(nums,k));
        Long endTimeSet = System.currentTimeMillis();
        System.out.println(endTimeSet - startTimeSet + " s");
    }

    static int solution(int[] nums, int k){
        int result = k;
        Arrays.sort(nums);
        for(int num : nums){
            if(num == result){
                result *= 2;
            }
        }
        return result;
    }
    static int solution1(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);
        }
        int result = k;
        while(set.contains(result)){
            result *= 2;
        }
        return result;
    }
}
