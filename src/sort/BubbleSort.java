package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        int[] arr1 = {1, 5, 1, 2, 2};
        int[] arr2 = {};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr1)));
        System.out.println(Arrays.toString(bubbleSort(arr2)));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
