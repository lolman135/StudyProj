package ua.lesson11._02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import static ua.lesson11.utils.Constants.BASE_PATH;

public class Main {

    public static void main(String[] args) throws IOException{
        String filePath = BASE_PATH + "myfile.txt";
        getOutput(readFile(filePath));
    }

    public static String readFile(String filePath) throws IOException {

        StringBuilder builder;

        try(FileChannel channel = new FileInputStream(filePath).getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(128);
            builder = new StringBuilder();

            while (channel.read(buffer) != -1) {
                buffer.flip();
                builder.append(Charset.defaultCharset().decode(buffer));
                buffer.clear();
            }
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }

        return builder.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
