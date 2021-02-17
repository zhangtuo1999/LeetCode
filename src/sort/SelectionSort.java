package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        int[] arr1 = {1, 5, 1, 2, 2};
        int[] arr2 = {};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(selectionSort(arr1)));
        System.out.println(Arrays.toString(selectionSort(arr2)));
    }

    private static int[] selectionSort(int[] arr) {
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            swap(arr,i,min);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
