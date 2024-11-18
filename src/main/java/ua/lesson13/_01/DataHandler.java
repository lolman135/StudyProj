package ua.lesson13._01;

public class DataHandler {

    synchronized void printData(int number)  {
        for (int i = 1; i < 5; i++) {
            int res = number * i;
            System.out.println(res);

            try {
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
