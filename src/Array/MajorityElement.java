package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,1,2,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr){
        int num = 0;
        int sum = 0;
        for(int curr : arr){
            if(sum == 0){
                num = curr;
                sum++;
            }
            else if(curr == num){
                sum++;
            }
            else{
                sum--;
            }
        }
        return num;
    }
}
