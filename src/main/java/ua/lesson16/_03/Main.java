package ua.lesson16._03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 3, 4, 2, 7, 3, 7, 8, 6, 5);
//
//        Consumer<Integer> consumer = value -> System.out.println("Value is " + value);
//        for (Integer integer : list) {
//            consumer.accept(integer);
//        }
//
//        List<String> strings = Arrays.asList("wewrew", "ygw3", "gfysgfs", "fggdgf");
//
//        Consumer<String> stringConsumer = value -> System.out.println("Value is " + value);

        String name = "LuxBerger";
        Product product = getProduct(() -> new Product(name));
        System.out.println(product.getName());

        Predicate<Integer> predicate = num -> num % 2 == 0;
        Predicate<Integer> predicate2 = predicate.and(num -> num > 10);
        Predicate<Integer> predicate3 = predicate.negate();

        System.out.println(predicate2.test(13 ));
        System.out.println(predicate3.test(13 ));

        List<Integer>  list =  new ArrayList<>();
        list.add(3);
        list.add(24);
        list.add(6);
        list.add(2);
        list.add(45);


        System.out.println("BEFORE: " + list);
        list.removeIf(num -> num % 2 != 0);
        System.out.println("AFTER: " + list);

        UnaryOperator<Integer> unaryOperator = num -> num * num;
        System.out.println(unaryOperator.apply(4));
        BinaryOperator<Integer> binaryOperator = (a, b) -> a - b;
        System.out.println(binaryOperator.apply(4, 5));
    }

    public static Product getProduct(Supplier<Product> supplier){
        return supplier.get();
    }
}
