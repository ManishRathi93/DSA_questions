package Hashing_Sets;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {4,9,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int[] arr1, int[] arr2){
        Set<Integer> list = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num)){
                list.add(num);
            }
        }
        int[] lst = new int[list.size()];
        int i = 0;
        for(int num : list){
            lst[i] = num;
            i++;
        }
        return lst;
    }
}
