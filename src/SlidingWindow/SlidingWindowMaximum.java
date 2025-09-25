package SlidingWindow;

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Deque stores indices, not values
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices whose corresponding values are smaller than nums[i]
            // They can never be maximum while nums[i] is in the window
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // The front of deque contains index of maximum element for current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Window size: " + k);

        int[] result = maxSlidingWindow(nums, k);
        System.out.println("Result: " + Arrays.toString(result));

        // Detailed step-by-step execution
        System.out.println("\n--- Detailed Execution ---");
        demonstrateDequeSteps(nums, k);
    }

    public static void demonstrateDequeSteps(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("Step-by-step execution:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nProcessing index " + i + " (value = " + nums[i] + ")");

            // Remove out of window indices
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                int removed = deque.pollFirst();
                System.out.println("  Removed index " + removed + " (out of window)");
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                int removed = deque.pollLast();
                System.out.println("  Removed index " + removed + " (value " + nums[removed] +
                        " < " + nums[i] + ")");
            }

            deque.offerLast(i);
            System.out.println("  Added index " + i + " to deque");
            System.out.println("  Deque indices: " + deque);
            System.out.print("  Deque values: [");
            for (int idx : deque) {
                System.out.print(nums[idx] + " ");
            }
            System.out.println("]");

            if (i >= k - 1) {
                System.out.println("  Window complete! Maximum = " + nums[deque.peekFirst()]);
            }
        }
    }
}