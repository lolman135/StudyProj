package ua.lesson15.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        Person2 person1 = new Person2(1, "Misako", 32);
        Person2 person2 = new Person2(2, "Den", 18);
        Person2 person3 = new Person2(3, "Anton", 23);
        Person2 person4 = new Person2(4, "Lex", 34);

        HashMap<Integer, Person2> persons = new HashMap<>();
        persons.put(person1.getId(), person1);
        persons.put(person2.getId(), person2);
        persons.put(person3.getId(), person3);
        persons.put(person4.getId(), person4);

        printMap(persons);
    }

    private static void printMap(Map<Integer, Person2> map){
        for(Map.Entry<Integer, Person2> entry : map.entrySet()){
            System.out.println("ID: " + entry.getKey() + " value: " + entry.getValue().printInfo());
        }
    }
}
