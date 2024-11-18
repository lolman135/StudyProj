package ua.lesson18;

import java.util.UUID;

public class StudentUtil {

    public static Student getNewStudent(String name, int age){
        return new Student("Mark", 21, UUID.randomUUID().toString());
    }


    public static Student getStudentById(String id){
        return StudentRepository.list.stream()
                .filter(student -> student.getId().equals(id))
                .toList()
                .getFirst();
    }
}
