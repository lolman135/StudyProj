package ua.lesson13._01;

public class Thread1 extends Thread{


    DataHandler dataHandler;

    public Thread1(DataHandler dataHandler){
        this.dataHandler = dataHandler;
    }
    @Override
    public void run() {
        dataHandler.printData(100);
    }
}
