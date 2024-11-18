package ua.lesson14.list.linkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Mocco");
        linkedList.add("Micro");
        linkedList.add("Max");
        linkedList.add("Apple");
        System.out.println(linkedList);
        linkedList.addFirst("ID");
        System.out.println(linkedList);
        linkedList.addLast("Potato");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst() + "\n" + linkedList.getLast()  );
    }
}
