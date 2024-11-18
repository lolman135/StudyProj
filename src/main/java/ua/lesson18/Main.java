package ua.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<Person> personOptional = Optional.of(new Person("Max", 24));
        Optional<Person> personOptional1 = Optional.empty();

        //Optional<Person> personOptional1 = Optional.of(null); - throws NPE
        //Optional<Person> personOptional1 = Optional.ofNullable(null);

//        System.out.println(personOptional);

//        if(personOptional1.isPresent()){
//            System.out.println(personOptional1);
//        } else {
//            System.out.println("No data!");
//        }

//        System.out.println(personOptional1.orElse(new Person("DEAFULT", 1)));
//
//        System.out.println(personOptional.orElseGet(() -> new Person("DEAFULT", 1)));
//
//        System.out.println(personOptional1.orElseThrow(() -> new IllegalArgumentException("NO DATA!!!")));

//        System.out.println(personOptional
//                .filter(person -> person.getAge() % 2 == 0)
//                .filter(person -> person.getName().equals("Max"))
//                .orElse(new Person("DEFAULT", 1)));

        System.out.println(personOptional
                .filter(person -> person.getAge() % 2 == 0)
                .filter(person -> person.getName().equals("Max"))
                .map(person -> person.getName().toUpperCase())
                .get());

        Optional<String> opt1 = Optional.of("Orange");
        Optional<String> opt2 = Optional.empty();

        System.out.println(opt1.or(() -> Optional.of("Apple")));
        System.out.println(opt2.or(() -> Optional.of("Apple")));

        //java 8
//        if (opt2.isPresent()){
//            System.out.println(opt2.get());
//        } else {
//            System.out.println("NO DATA!!");
//        }

        //java 9 and higher
//        opt2.ifPresentOrElse(
//                System.out::println,
//                () -> {
//                    throw new IllegalArgumentException("NO DATA");
//                });

        List<Optional<String>> list = Arrays.asList(
                Optional.ofNullable("Orange"),
                Optional.ofNullable("Apple"),
                Optional.ofNullable("Banana"),
                Optional.ofNullable(null),
                Optional.ofNullable("Mellon"),
                Optional.ofNullable(null)

        );

        System.out.println(list);

        //java 8
//        List<String> listValues = list.stream()
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .toList();
//
//        System.out.println(listValues);

        List<String> list1 = list.stream()
                .flatMap(Optional::stream)
                .toList();

        System.out.println(list1);
    }
}
