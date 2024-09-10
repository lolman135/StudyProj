package ua.lesson6.garbageCollectorTest;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[100000000];

        for (Student student : students) {
            student = new Student();
        }

        students = null;

        students = new Student[90000000];
        for (Student student : students) {
            student = new Student();
        }

    }
}
