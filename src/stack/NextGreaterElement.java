package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 4};
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solutionOptimized(arr, arr1)));
    }

    public static int[] solution(int[] arr, int[] arr1) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int nextGreater = -1;

            // Find the position of num in arr1
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == num) {
                    // Search for the next greater element
                    for (int k = j + 1; k < arr1.length; k++) {
                        if (arr1[k] > num) {
                            nextGreater = arr1[k];
                            break;
                        }
                    }
                    break;
                }
            }
            ans[i] = nextGreater;
        }

        return ans;
    }

    public static int[] solutionOptimized(int[] arr, int arr1[]){
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        //1,2,3,4
        for(int num : arr1){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int[] ans = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            ans[i] = map.getOrDefault(arr[i],-1);
        }
        return ans;
    }
}
