package ua.lesson8;

public class Main06 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        try{
            arr[5] = 30/7;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException arre){
            System.out.println(arre.getMessage());
        } catch (Exception e){
            System.out.println("Exception is occured");
        }

        System.out.println("Next code");
    }
}
