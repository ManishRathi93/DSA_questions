package String;

public class RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(()(()))";
        System.out.println(solution(s));
    }

    static String solution(String s){
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(c == '('){
                if(depth > 0){
                    sb.append(c);
                }
                ++depth;
            }
            else if(c == ')'){
                --depth;
                if(depth > 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
