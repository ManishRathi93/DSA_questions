package Array;

import java.util.*;

public class IntersectionOfMultiple {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6}
        };
        intersection(arr);

    }
    public static void intersection(int[][] arr){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                map.put(arr[row][col],map.getOrDefault(arr[row][col],0)+1);
                if(map.get(arr[row][col]) == arr.length){
                    list.add(arr[row][col]);
                }
            }
        }
        System.out.println(list);
    }
}
