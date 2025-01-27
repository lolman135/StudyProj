package ua.lesson19.sortAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        int counter = 0;

        for (int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length-i-1; j++){
                counter++;
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("counter: " + counter);
    }
}
