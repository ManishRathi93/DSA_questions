package String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String str = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(isPalindrome(str, 0,str.length() - 1));

    }
    public static boolean isPalindrome(String str, int start, int end){
        if(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            return isPalindrome(str, ++start, --end);
        }
        return true;
    }
}
