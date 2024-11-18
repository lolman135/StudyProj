package ua.lesson14.set.treeset;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("Dumbass");
        tree.add("Maks");
        tree.add("Apple");

        System.out.println(tree);

        tree.removeFirst();
        System.out.println(tree);
    }
}
