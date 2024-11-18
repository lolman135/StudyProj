package ua.lesson10._02;

import ua.lesson10.utils.Constants;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream {

    static String fileNameIn;
    static String fileNameOut;
    static byte[] bytes;
    static FileInputStream fin;
    static FileOutputStream fout;

    public static void main(String[] args) {
        fileNameIn = "record_01.txt";
        fileNameOut = "record_02.txt";

        try {
            fin = new FileInputStream(Constants.BASE_PATH_OUT + fileNameIn);
            fout = new FileOutputStream(Constants.BASE_PATH_OUT + fileNameOut);

            //bytes = fin.available();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
