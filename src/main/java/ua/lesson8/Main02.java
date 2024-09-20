package ua.lesson8;

public class Main02 {
    public static void main(String[] args) {

         int num = 0;
         int superNum = 10;

         try {
             int result = superNum/num;
         } catch (ArithmeticException e){
             System.out.println("Exception: " + e.getMessage());
         }
    }
}
