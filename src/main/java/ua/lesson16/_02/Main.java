package ua.lesson16._02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        List<String> words = Arrays.asList("banana", "apple", "suzuki", "pipisun");
//
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        System.out.println();
//
//        words.forEach(word -> System.out.println(word));
//
//        System.out.println();
//
//        words.forEach(System.out::println);
//
//        words.sort(String::compareToIgnoreCase);
//        System.out.println(words);

        IPrint print = DemoRefClass::new   ;

        print.display("heheheh");
    }
}
