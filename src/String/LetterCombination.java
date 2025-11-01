package String;

import java.util.*;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(solution("2"));

    }
    public static List<String> solution(String str){
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', Arrays.asList("a","b","c"));
        map.put('3',Arrays.asList("d","e","f"));
        map.put('4',Arrays.asList("g","h","i"));

        List<String> ans = new ArrayList<>();
        char[] arr = str.toCharArray();

        if(str.length() == 1){
            return map.get(arr[0]);
        }

        else if(str.length() == 2){
            int i = 0;

        }
        return new ArrayList<>();
    }
}
