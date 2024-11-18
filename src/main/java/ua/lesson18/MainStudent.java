package ua.lesson18;

import java.util.UUID;

public class MainStudent {

    public static void main(String[] args) {

        Student man = StudentUtil.getNewStudent("Max", 34);
        System.out.println(man);

    }
}
