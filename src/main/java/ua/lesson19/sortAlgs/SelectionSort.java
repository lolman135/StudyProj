package ua.lesson19.sortAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        int counter = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            int small = i;

            for (int j = small; j <= array.length - 1; j++) {
                counter++;
                if (array[j] < array[small]){
                    small = j;
                }
            }

            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;

        }
        System.out.println(Arrays.toString(array));
        System.out.println("counter: " + counter);
    }
}
