package Array;


import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
//        int [][] interval = {{1,3},{3,7},{5,7},{7,8}};
        int[][] interval = {
                {2,10},
                {3,7},
                {3,15},
                {4,11},
                {6,12},
                {6,16},{7,8},
                {7,11},{7,15},{11,12}};
//         [[2,10],[3,7],[3,15],[4,11],[6,12],[6,16],[7,8],[7,11],[7,15],[11,12]]

        System.out.println(solution(interval));

    }

    public static int solution(int[][] nums){
        Arrays.sort(nums,(a,b)->a[1] - b[1]);

        List<Integer> list = new ArrayList<>();
        for(int[] row : nums){
            int count = 0;
            int start = row[0];
            int end = row[1];

            for(int x : list){
                if((x >= start) && (x <= end)) count++;
            }
            if (count == 0) {
                if (!list.contains(end - 1) && end - 1 >= start)
                    list.add(end - 1);

                if (!list.contains(end))
                    list.add(end);
            }
            else if (count == 1) {
                if(list.contains(end)){
                    list.add(end - 1);
                }
                else{
                    list.add(end);
                }
            }
        }
        System.out.println(list);
        return list.size();
    }

}
