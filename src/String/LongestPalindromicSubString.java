package String;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s ="babad";
        System.out.println(longestPalindromicString(s));

    }
    static int start = 0;
    static int maxLen = 0;
    public static String longestPalindromicString(String s){
        if(s.isEmpty()){
            return "";
        }

        for(int i = 0;i < s.length();i++){
            //for odd
            expandFromCenter(s,i,i);
            //for even
            expandFromCenter(s,i,i+1);


        }
        return s.substring(start,start + maxLen);
    }
    private static void expandFromCenter(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        int len = right - left - 1;
        if(len > maxLen){
            start = left + 1;
            maxLen = len;
        }
    }
}
