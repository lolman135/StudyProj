package ua.lesson17._01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        Stream<String> stringStream = Stream.empty();
//        stringStream.forEach(System.out::println);

        Integer[] nums = {4, 2, 6, 4, 1};
        Stream<Integer> stream = Arrays.stream(nums);
        //stream.forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(nums);
        Stream<Integer> stream1 = integerList.stream();
        //stream1.sorted().forEach(System.out::println );

        Stream<Integer> stream3 = Stream.of(1, 4, 5, 4, 2, 5, 2, 6, 3);
        stream3.sorted().forEach(System.out::println);

        Stream.Builder<Integer> builder = Stream.builder();
        Stream<Integer> stream2 = builder.add(1).add(4).add(32).build();
    }
}
