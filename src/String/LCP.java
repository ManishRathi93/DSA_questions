package String;

public class LCP {
    public static void main(String[] args) {
        String[] str = {"Flower","Flow","Flight"};
        System.out.println(commonPrefix(str));
    }
    public static String commonPrefix(String[] str){
        if(str == null || str.length == 0){
            return "";
        }
        String prefix = str[0];
        for(int i = 1;i < str.length;i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
