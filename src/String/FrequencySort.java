package String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencySort {
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(solution(s));
    }

    static String solution(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue()) // compare frequencies
                .map(entry -> String.valueOf(entry.getKey()).repeat(entry.getValue())) // repeat character
                .collect(Collectors.joining());
    }
}
