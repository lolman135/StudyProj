package ua.lesson10._02;

import ua.lesson10.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

    static String fileName;
    static String path;
    static FileInputStream fin;

    public static void main(String[] args) {

        fileName = "record_01.txt";
        path = Constants.BASE_PATH_OUT + fileName;

        try {
            fin = new FileInputStream(path);
            int i;
            while ((i = fin.read()) != -1){
                System.out.print((char) i);
            }

            fin.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
