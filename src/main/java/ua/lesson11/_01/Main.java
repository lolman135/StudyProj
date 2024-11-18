package ua.lesson11._01;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static ua.lesson11.utils.Constants.BASE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = "Some information.";

        String filePath = BASE_PATH + "myfile.txt";
        getOutput(writeToFile(content, filePath));
    }

    public static String writeToFile(String content, String filePath) throws IOException {

        try(FileChannel fileChannel = new FileOutputStream(filePath).getChannel()) {
            byte[] contentBytes = content.getBytes();
            ByteBuffer byteBuffer = ByteBuffer.allocate(contentBytes.length);

            byteBuffer.put(contentBytes);

            byteBuffer.flip();

            fileChannel.write(byteBuffer);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return  "The content has been written";
    }

    private static void getOutput(String string){
        System.out.println(string);
    }
}
