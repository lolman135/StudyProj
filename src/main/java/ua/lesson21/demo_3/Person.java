package ua.lesson21.demo_3;

public class Person {

    public String name;
    private int age;

    boolean defaultBoolean;
    protected int height;

    private Person() {
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
