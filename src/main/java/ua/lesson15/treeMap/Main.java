package ua.lesson15.treeMap;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> dict =  new TreeMap<>();

        dict.put(5, "Int");
        dict.put(1, "Const");
        dict.put(4, "MrBux");
        dict.put(2, "ect");

        System.out.println(dict);

        Integer firstKey = dict.firstKey();
        System.out.println(firstKey);
        String firstValue = dict.get(firstKey);
        System.out.println(firstValue);
        System.out.println(dict.firstEntry());
    }
}
