package ua.lesson11._03;

import java.nio.ByteBuffer;

public class Main {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);

        for (int i = 0; i < ALPHABET.length(); i++) {
            byteBuffer.put((byte) byteBuffer.get());
        }

        //getOutput(byteBuffer);

        System.out.println("Marking the buffer");
        byteBuffer.mark();
        //getOutput(byteBuffer);
    }


}
