package ua.lesson8;

public class Main03 {
    public static void main(String[] args) {

         try {
             int res = 10/0;
         } catch (ArithmeticException e){
             System.out.println("Cannot divine by zero");
         }

         int a = 15;
         int b = 0;
         int c = 3;

         try {
             int r = a / b;
             System.out.println(r);
         } catch (ArithmeticException e){
             int r = a / (b + c);
             System.out.println(r);
         }
    }
}
