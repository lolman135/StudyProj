package ua.lesson19.searchAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        sort(array);

        System.out.println(Arrays.toString(array));
        int num = binarySearch(array, 9);
        System.out.println(num);

    }

    private static int binarySearch(int[] arr, int element){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){

            int mid = (low + high)/2;

            if (arr[mid] < element){
                low = mid + 1;
            } else if(arr[mid] > element){
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i -1;

            while(j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
}
