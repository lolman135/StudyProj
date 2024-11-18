package ua.lesson17._01;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    public static List<Person> getData() {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Tom", 23));
        list.add(new Person("Jerry", 21));
        list.add(new Person("Mike", 16));
        list.add(new Person("Mike", 23));
        list.add(new Person("Lucy", 33));
        list.add(new Person("Daniel", 27));

        return list;
    }
}
