package ua.lesson14.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("bababe");
        list.add("bababe");
        list.add("bababe");
        list.add("bababe");
        list.add("bababe");
        list.add("bababe");
        list.add("bababe");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Aboba");
        list2.add("Huebobmbom");
        list.addAll(list2);
        System.out.println(list.size());

        System.out.println(list.lastIndexOf("bababe"));
    }
}
