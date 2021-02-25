package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        int[] arr1 = {1, 5, 1, 2, 2};
        int[] arr2 = {};
        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr1)));
        System.out.println(Arrays.toString(insertionSort(arr2)));
    }

    private static int[] insertionSort(int[] arr) {
        if(arr==null||arr.length==0)
            return arr;
        for(int i=1;i<arr.length;i++){
            int j=i,tmp=arr[i];
            while (j>0&&arr[j-1]>tmp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=tmp;
        }
        return arr;
    }

}
