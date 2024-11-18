package ua.lesson19.sortAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = ArrayUtil.getArray();

        int counter = 0;

        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i -1;

            while(j >= 0 && key < array[j]){
                counter++;
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("counter: " + counter);
    }
}
