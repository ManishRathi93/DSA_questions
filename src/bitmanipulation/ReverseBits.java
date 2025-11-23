package bitmanipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int num = 2147483644;
        System.out.println(reverseBits(num));
    }

    public static int reverseBits(int num){
        int result = 0;

        for(int i = 31;i >= 0;i--){
            result <<= 1;
            result |= (num & 1);
            num >>>= 1;
        }
        return result;
    }
}
