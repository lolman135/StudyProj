package ua.lesson15.hashmap;

import java.util.Objects;

public class Person2 {

    private int id;
    private String name;
    private int age;

    protected Person2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String printInfo(){
       return   "id" + id + " name: " + name + " age: " + age + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return id == person2.id && age == person2.age && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
