package Array;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "luffy is still joyboy";
        System.out.println(solution(str));
    }

    static int solution(String s){
       int count = 0;
       String str = s.trim();
       for(int i = str.length() - 1;i >= 0;i--){
           if(str.charAt(i) == ' '){
               break;
           }
           ++count;
       }

        return count;
    }
}
