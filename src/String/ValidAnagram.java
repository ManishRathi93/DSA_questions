package String;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "qmargana";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0;i < s1.length();i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for(int c : arr){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
