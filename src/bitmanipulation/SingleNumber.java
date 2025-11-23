package bitmanipulation;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr= {2,2,3,2};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr){
        int ones = 0, twos = 0;
        for(int num : arr){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
