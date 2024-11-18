package ua.lesson15.sortedMap;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

//        SortedMap<Integer, String> dict = new TreeMap<>((o1, o2) -> o1 - o2);
        NavigableMap<Integer, String> dict = new TreeMap<>((o1, o2) -> o1 - o2);

        dict.put(5, "Int");
        dict.put(1, "Const");
        dict.put(4, "MrBux");
        dict.put(2, "ect");

        System.out.println(dict);

//        dict.putFirst(0, "A");
//        System.out.println(dict);

//        Integer firstKey = dict.firstKey();
//        System.out.println(firstKey);
//        String firstValue = dict.get(firstKey);
//        System.out.println(firstValue);
//        System.out.println(dict.firstEntry());
//
//        System.out.println(dict.headMap(3));
//        System.out.println(dict.subMap(1, 5));

        System.out.println(dict.ceilingEntry(4));
        System.out.println(dict.higherEntry(4));
        System.out.println(dict.lowerEntry(4));
        NavigableMap<Integer, String> integerStringNavigableMap = dict.descendingMap();
        System.out.println(integerStringNavigableMap);
    }
}
