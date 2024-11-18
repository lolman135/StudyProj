package ua.lesson10._03;

import ua.lesson10.utils.Constants;

import java.io.File;

public class Example1 {

    static String dirName;
    public static void main(String[] args) {

        dirName = "AAA";
        File folder = new File(Constants.BASE_PATH_OUT + dirName);
        folder.mkdir();

        
    }
}
