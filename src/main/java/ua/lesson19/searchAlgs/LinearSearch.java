package ua.lesson19.searchAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();

        int number = search(array, 4);

        System.out.println(number);

    }

    private static int search (int[] arr, int numberToFind){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind){
                return i;
            }
        }
        return -1;
    }
}
