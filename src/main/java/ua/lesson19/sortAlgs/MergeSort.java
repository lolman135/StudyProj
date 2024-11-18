package ua.lesson19.sortAlgs;

import ua.lesson19.ArrayUtil;

import java.util.Arrays;

public class MergeSort {
    static int counter = 0;
    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();


        mergeSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));
        System.out.println("counter: " + counter);
    }

    private static int[] mergeSort(int[] arr, int low, int high){

        if (low < high){
            int mid = (low + high)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);

            merge(arr, low, mid, high);
        }
        return arr;
    }

    private static void merge(int[] subArr, int low, int  mid, int high){
        int n = high - low + 1;

        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while(i <= mid || j <= high){
            if (i > mid){
                temp[k++] = subArr[j++];
            } else if(j > high){
                temp[k++] = subArr[i++];
            } else if (subArr[i] < subArr[j]) {
                temp[k++] = subArr[i++];
            } else {
                temp[k++] = subArr[j++];
            }
            counter++;
        }
        for (j = 0; j < n; j++){
            subArr[low + j] = temp[j];
        }
    }
}
