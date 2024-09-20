package ua.lesson8;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 54, 2, 5, 3};

        try {
            System.out.println(arr[20]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
