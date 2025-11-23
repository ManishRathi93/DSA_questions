package CollectionFramework.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int size = 10_000;
        Random rand = new Random();

        for(int i = 0;i < size;i++){
            list.add(rand.nextInt(100));
        }

        Long startSeq = System.currentTimeMillis();
        int sum2 = list.stream()
                .map(x -> {
                    try{Thread.sleep(1);} catch (Exception e){}
                    return  x * 2;
                })
                .mapToInt(i -> i)
                .sum();
        Long endSeq = System.currentTimeMillis();


        Long startPara = System.currentTimeMillis();
        int sum3 = list.parallelStream()
                        .map(x -> {
                            try{Thread.sleep(1);} catch (Exception e){}
                            return  x * 2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        Long endPara = System.currentTimeMillis();


        System.out.println(sum2 + "  " + sum3);
        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("Para : " + (endPara - startPara));
    }
}
