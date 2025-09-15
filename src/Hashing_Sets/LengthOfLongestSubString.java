package Hashing_Sets;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "bbbb";
        System.out.println(lengthOfLongestSubString(s));
    }

    private static int lengthOfLongestSubString(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;

        for(int r = 0;r < s.length();r++){
            char c = s.charAt(r);

            if(map.containsKey(c)){
                l = Math.max(l,map.get(c) + 1);
            }
            map.put(c,r);
            max = Math.max(max,r-l + 1);
        }
        return max;
    }
}
