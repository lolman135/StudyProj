package ua.lesson14.set.linkedhashset;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add(null);
        set.add("Kiwi");
        set.addFirst("Pisun");
        set.removeLast();
        System.out.println(set);
    }


}
