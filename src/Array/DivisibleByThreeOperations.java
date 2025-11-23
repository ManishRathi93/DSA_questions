package Array;

public class DivisibleByThreeOperations {
    public static void main(String[] args) {
        int[] arr = {3,6,9};
        System.out.println(solution(arr));
    }

    static int solution(int[] arr){
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            int num = arr[i];
            float div = num % 3;
            if((int) div == 0) continue;
            else count++;
        }
        return count;
    }
}
