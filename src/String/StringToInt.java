package String;

public class StringToInt {
    public static void main(String[] args) {
//        System.out.println(solution("-032"));  // Output: -32
//        System.out.println(solution("-042"));  // Output: -42
        System.out.println(solution("  +123abc")); // Output: 123
    }

    static int solution(String s){
        int i = 0;
        int sign = 1;
        int num = 0;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') i++;

        // Handle sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check overflow
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}
