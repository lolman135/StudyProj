package ua.lesson15.linkedHashMap;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> dict =  new LinkedHashMap<>();
        dict.put(1, "Markus");
        dict.put(2, "Pedro");
        dict.put(5, "tomato");
        dict.put(4, "mix");
        dict.put(3, "potato");

        System.out.println(dict);
    }
}
