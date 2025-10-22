package stack;

public class TrappingRainWater {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr = {4,2,0,3,2,5};
        System.out.println(naiveSolution(arr));
        System.out.println(optimizedSolution1(arr));
        System.out.println(solutionOptimized(arr));
    }
    public static int naiveSolution(int[] nums){
        int sum = 0;
        int n = nums.length;
        for(int i = 1;i < n;i++){
            int maxLeft = 0;
            int maxRight = 0;
            int curr = nums[i];

            //maxLeft
            for(int j = i;j >= 0;j--){
                maxLeft = Math.max(nums[j],maxLeft);
            }
            //maxRight
            for(int j = i;j < n;j++){
                maxRight = Math.max(nums[j],maxRight);
            }

            //formula
            sum += Math.min(maxLeft,maxRight) - curr;

        }
        return sum;
    }

    public static int optimizedSolution1(int[] nums){
        int sum = 0;
        int n = nums.length;
        int[] maxLeft = new int[n];
        int[] maxRight =new int[n];
        maxLeft[0] = nums[0];
        maxRight[n-1] = nums[n-1];

        for(int i = 1;i < n;i++){
            maxLeft[i] = Math.max(maxLeft[i-1],nums[i]);
        }
        for(int i = n - 2;i >= 0;i--){
            maxRight[i] = Math.max(maxRight[i+1],nums[i]);
        }
        for(int i = 0;i < n;i++){
            sum += Math.min(maxLeft[i],maxRight[i]) - nums[i];
        }
        return sum;
    }

    public static int solutionOptimized(int[] height){
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        int rmax = 0, lmax = 0;

        while(left < right){
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);

            if(lmax < rmax){
                ans += lmax - height[left];
                left++;
            }else{
                ans += rmax - height[right];
                right++;
            }

        }
        return ans;
    }
}