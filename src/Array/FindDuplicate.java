package Array;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,2};
        System.out.println(floydCycleDetection(arr));
    }
    public static int binarySearch(int[] nums){
        int low = 1, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Count numbers <= mid
            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                high = mid;  // duplicate is in left half
            } else {
                low = mid + 1; // duplicate is in right half
            }
        }
        return low;
    }

    public static int floydCycleDetection(int[] arr){
        int slow = arr[0];
        int fast = arr[0];

        //cycle detection
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while (slow != fast);

        //find duplicate
        fast = arr[0];
        while (slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

}
