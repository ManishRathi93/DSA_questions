package String;

public class UniqueLengthThreePalindrome {
    public static void main(String[] args) {
        String str = "bbcbaba";
        System.out.println(solution(str));
    }

    static int solution(String str){
        int ans = 0;
        for(char c = 'a';c <= 'z';c++){
            int left = -1, right = -1;

            for(int i = 0;i < str.length();i++){
                if(str.charAt(i) == c){
                    if(left == -1) left = i;
                    right = i;
                }
            }
            if(left == -1 || left == right) continue;

            boolean[] seen = new boolean[26];
            for(int i = left + 1;i < right;i++){
                seen[str.charAt(i) - 'a'] = true;
            }
            for(boolean b : seen){
                if(b) ans++;
            }
        }
        return ans;
    }
}
