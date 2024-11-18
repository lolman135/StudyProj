package ua.lesson21.demo_3;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Person person = new Person("Max", 32);

        ReflectionUtil.showFullClassName(person);
        ReflectionUtil.showSimpleClassName(person);
        System.out.println();
        ReflectionUtil.showAllClassField(person);
        ReflectionUtil.showAllMethodsField(person);

        System.out.println(person.getAge());
        ReflectionUtil.setValuePrivateField(person, "age", 190);
        System.out.println(person.getAge());

        Person person2 = (Person) ReflectionUtil.createNewObject(person);
        System.out.println(person2.toString());

        Person person3 = (Person) ReflectionUtil.createNewObject2(person);
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
    }
}
