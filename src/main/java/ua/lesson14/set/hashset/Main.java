package ua.lesson14.set.hashset;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Kiwi");
        set.add("Banana");
        System.out.println(set);
        for (String string : set) {
            System.out.println(string);
        }
        //set.forEach(e -> System.out.println(e));
        System.out.println();
    }
}
