package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0;i < 2 * n;i++){
            int curr = nums[i % n];
            while(!stack.isEmpty() && nums[stack.peek()] < curr){
                ans[stack.pop()] = curr;
            }
            if(i < n){
                stack.push(i);
            }
        }
        return ans;
    }
}
