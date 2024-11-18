package ua.lesson17._01;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);

//        System.out.println("BEFORE: " + list);
//        list.stream()
//                .filter(num -> num % 2 == 0 && num >= 4)
//                .filter(num -> num > 21)
//                .filter(num -> num % 2 == 0)
//                .forEach(System.out::println);
//
//        System.out.println("AFTER: " + list);

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        map.put(4, "four");
//        System.out.println(map);
//
//        Map<Integer, String> newMap = map.entrySet().stream()
//                        .filter(entry -> entry.getValue().equals("three"))
//                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(newMap);
//

//        List<Integer> newList = list.stream()
//                .map(num -> num * num)
//                .toList();
//
//        System.out.println(newList);
//        List<String> stringList = Arrays.asList("banana", "Tomato", "Mix", "tutor");
//        System.out.println(stringList);
//
//        stringList.stream()
//                .map(String::length)
//                .filter(length -> length > 5)
//                .forEach(System.out::println);

//        List<Integer> list2 = new ArrayList<>();
//        list2.add(4);
//        list2.add(2);
//        list2.add(4);
//        list2.add(5);
//        list2.add(8);
//        list2.add(8);
//
//        List<List<Integer>> lists = Arrays.asList(list, list2, newList);
//
//        System.out.println(lists);
//        lists.stream().forEach(System.out::println);
//
//        List<Integer> allLists = lists.stream()
//                .flatMap(Collection::stream)
//                .toList();
//
//        System.out.println(allLists);
//
//        System.out.println(list.stream()
//                .allMatch(num -> num > 4));

        System.out.println(list.stream()
                        .sorted(Comparator.reverseOrder())
                .findFirst().get());

        Optional<Integer> reduce = list.stream()
                .filter(Objects::nonNull)
                .reduce((a, b) -> Integer.sum(a, b));

        System.out.println(reduce.get());

    }

}
