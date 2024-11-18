package ua.lesson13._01;

public class Thread2 extends Thread{


    DataHandler dataHandler;

    public Thread2(DataHandler dataHandler){
        this.dataHandler = dataHandler;
    }
    @Override
    public void run() {
        dataHandler.printData(5);
    }
}
