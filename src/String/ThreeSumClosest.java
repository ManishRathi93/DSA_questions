package String;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] arr = {-1,2,1,-4};
        System.out.println(solution(arr,1));
    }

    public static int solution(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2];

        for(int i = 0;i < n - 2;i++){
            int left = i+ 1;
            int right = n - 1;

            while(left < right){
                int currentSum = arr[i] + arr[left] + arr[right];

                if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                    closestSum = currentSum;
                }
                if(currentSum < target){
                    left++;
                }
                else if(currentSum > target){
                    right--;
                }
                else return currentSum;
            }
        }
        return closestSum;
    }
}
