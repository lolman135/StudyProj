package ua.lesson8;

public class Main05 {

    public static void main(String[] args) {
        String str = null;

        try{
            System.out.println(str.length());
        } catch (NullPointerException npe){
            System.out.println("Trying to get lenth of Null");
        }
    }
}
