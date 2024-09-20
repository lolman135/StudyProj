package ua.lesson8;

public class Main04 {

    static int num;

    public static void main(String[] args) {

        try{
            num = Integer.parseInt("five");
            System.out.println("Result: " + num);
        } catch (NumberFormatException nfe){
            System.out.println("Not a number");
        }

        System.out.println(num);
    }
}
