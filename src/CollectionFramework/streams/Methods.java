package CollectionFramework.streams;

import java.util.Arrays;
import java.util.List;

public class Methods {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,1,0,3,8);
        int result = nums.stream()
                                .filter(x -> x % 2 == 0)
                                .map(n ->(n * 2))
                                .reduce(0, Integer::sum); //Method Reference

        System.out.println(result);

        nums.forEach(System.out::println);
    }
}

