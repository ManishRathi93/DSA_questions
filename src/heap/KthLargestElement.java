package heap;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        System.out.println(solution(arr,2));
    }

    static int solution(int[] arr,int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
