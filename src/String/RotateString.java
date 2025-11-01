package String;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "deabc";
        System.out.println(solution(s,goal));
    }

    static boolean solution(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String ans = s + s;
        return ans.contains(goal);
    }
}
