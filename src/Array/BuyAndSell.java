package Array;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(stock(arr));
    }
    public static int stock(int[] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            min = Math.min(num,min);
            max = Math.max(max,num - min);
        }
        return max;
    }
}
