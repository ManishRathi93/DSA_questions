package Array;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String hayStack = "a";
        String needle = "a";
        System.out.println(solution(hayStack,needle));
    }

    static int solution(String hayStack, String needle){
        int n = hayStack.length();
        int m = needle.length();

        if(m == 0) return 0;
        if(m > n) return -1;

        for(int i = 0;i <= n - m;i++){
            int j = 0;
            while(j < m && hayStack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
            if(j == m){
                return i;
            }
        }

        return -1;
    }
}
