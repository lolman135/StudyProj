package ua.lesson19.sortAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class QuickSort {
    static int counter = 0;

    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
        System.out.println("counter: " + counter);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            counter++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
