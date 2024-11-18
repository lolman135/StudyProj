package ua.lesson14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("orange");
        queue.add("banana");
        queue.add("kiwi");
        queue.add(null); // <- null дозволено
        queue.add("banana"); // <- Дублікат дозволено
        queue.add("apple");
        // Виведення елементів
        System.out.println("Data: " + queue);
        String head = queue.remove();
        System.out.println(head);
        System.out.println(queue);

    }
}
