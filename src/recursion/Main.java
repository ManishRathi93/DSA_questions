package recursion;

public class Main {
    public static void main(String[] args) {
        solution(5);
    }
    public static void solution(int n){
        if(n == 0){
            return;
        }
        solution(n-1);
        System.out.println(n);

    }
}
