package ua.lesson15.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> dict= new HashMap<>();
        dict.put(1, "Markus");
        dict.put(2, "Pedro");
        dict.put(3, "tomato");
        dict.put(4, "mix");
        dict.put(5, "potato");

        System.out.println(dict);

//        HashMap<Integer, String> dict2= new HashMap<>();
//        dict2.put(7, "Markus");
//        dict2.put(8, "Pedro");
//        dict2.put(9, "tomato");
//        dict2.put(4, "mrInt");
//        dict2.put(5, "pesPatron");



//        HashMap<String, Integer> dict2 = new HashMap<>();
//        dict2.put("Markus", 1);
//        dict2.put("Pedro", 2);
//        dict2.put("tomato", 3);
//        dict2.put("mix", 4);
//        dict2.put("potato", 5);
//        dict2.put("rumba", 3);

//        dict.putIfAbsent(3, "Orange");
//        dict.put(null, "NullValue");
//
//        System.out.println(dict);
//        System.out.println(dict.get(3));
//
//        dict.putAll(dict2);
//        System.out.println(dict);
//
//        System.out.println(dict.getOrDefault(11, "Ni such value"));
//        System.out.println(dict.isEmpty());
//        System.out.println(dict.containsKey(1));
//        System.out.println(dict.containsValue("Makaka"));
//
//        String value = dict.replace(1, "Sir");
//        System.out.println(value);
//        System.out.println(dict);

        System.out.println(dict.remove(3));
        System.out.println(dict);

//        dict.forEach((id, value) -> System.out.println("id: " + id + " value: " + value));



        for (Map.Entry<Integer, String> entry : dict.entrySet()){
            System.out.println(entry);
        }
//        dict.clear();
//        System.out.println(dict);
//        System.out.println(dict.isEmpty());
    }



}
