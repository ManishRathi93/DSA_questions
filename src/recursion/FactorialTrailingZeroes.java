package recursion;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int count = 1;
        while (n > 0) {
            count = count * n;
            n = n - 1;
        }
        int zeros = countZeros(count);
        return zeros;
    }

    public static int countZeros(int n){
        int count = 0;
        while(n > 0){
            if(n % 10 == 0){
                ++count;
            }
            n = n / 10;
        }
        return count;
    }
}
