package ua.lesson10._01;

import ua.lesson10.utils.Constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutStream {

    private static String fileName;
    private static String myFile;

    public static void main(String[] args) {

        fileName = "record_01.txt";
        myFile = Constants.BASE_PATH_OUT + fileName;

        try (FileOutputStream fout = new FileOutputStream(myFile);
            Scanner scanner = new Scanner(System.in);) {

            print("Enter file content to write: ");
            String textToWrite = scanner.nextLine();

            byte[] bytes = textToWrite.getBytes();
            fout.write(bytes);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void print(String message){
        System.out.print(message);
    }


}
