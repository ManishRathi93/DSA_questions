package bitmanipulation;

public class BitAndOfNumberRange {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;
        System.out.println(solution(left,right));
    }

    public static int solution(int left, int right){
        int shift = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}
