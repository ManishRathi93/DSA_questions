package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaderOptimized(arr));
    }
    public static List<Integer> leader(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            int start = arr[i];
            for(int j = i+1;j <arr.length;j++) {
                if (arr[j] > start) {
                    break;
                }
                if (j == arr.length - 1) {
                    list.add(start);
                }
            }
        }
        list.add(arr[arr.length - 1]);
        return list;
    }

    public static List<Integer> leaderOptimized(int[] arr){
        List<Integer> list = new ArrayList<>();
        int n = arr.length - 1;
        int rightMax = arr[n];
        list.add(rightMax);

        for(int i = n-1;i >= 0;i--){
            if(arr[i] > rightMax){
                rightMax = arr[i];
                list.add(rightMax);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
