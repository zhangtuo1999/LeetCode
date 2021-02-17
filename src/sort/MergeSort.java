package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        int[] arr1 = {1, 5, 1, 2, 2};
        int[] arr2 = {};
        mergeSort(arr, 0, arr.length - 1);
        mergeSort(arr1, 0, arr.length - 1);
        mergeSort(arr2, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(arr==null||arr.length==0) return ;

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        int p1 = left, p2 = mid + 1, k = left;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] < arr[p2]) {
                temp[k++] = arr[p1++];
            } else if (arr[p1] > arr[p2]) {
                temp[k++] = arr[p2++];
            } else {
                temp[k++] = arr[p1++];
                temp[k++] = arr[p2++];
            }
        }
        while (p1 <= mid) temp[k++] = arr[p1++];
        while (p2 <= right) temp[k++] = arr[p2++];
        for (int i = left; i < right; i++) {
            arr[i] = temp[i];
        }
    }

}
