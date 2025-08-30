package String;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] str = s.split(" ");
        reverse(str);
        String words = String.join(" ",str);
        System.out.println(words);
    }
    public static void reverse(String[] s){
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
