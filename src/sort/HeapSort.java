package sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        int[] arr1 = {1, 5, 1, 2, 2};
        int[] arr2 = {};
        System.out.println(Arrays.toString(heapSort(arr)));
        System.out.println(Arrays.toString(heapSort(arr1)));
        System.out.println(Arrays.toString(heapSort(arr2)));
    }

    public static int[] heapSort(int[] arr) {
        // 构建初始大顶堆
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            // 将最大值放到数组最后
            exchange(arr, 0, i);
            // 调整剩余数组，使其满足大顶堆
            maxHeapify(arr, 0, i);
        }
        return arr;
    }

    // 构建初始大顶堆
    public static void buildMaxHeap(int[] arr) {
        // 从最后一个非叶子结点开始调整大顶堆，最后一个非叶子结点的下标就是 arr.length / 2-1
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, arr.length);
        }
    }

    // 调整大顶堆，第三个参数表示剩余未排序的数字的数量，也就是剩余堆的大小
    private static void maxHeapify(int[] arr, int i, int heapSize) {
        // 左子结点下标
        int l = 2 * i + 1;
        // 右子结点下标
        int r = l + 1;
        // 记录根结点、左子树结点、右子树结点三者中的最大值下标
        int largest = i;
        // 与左子树结点比较
        if (l < heapSize && arr[l] > arr[largest]) {
            largest = l;
        }
        // 与右子树结点比较
        if (r < heapSize && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            // 将最大值交换为根结点
            exchange(arr, i, largest);
            // 再次调整交换数字后的大顶堆
            maxHeapify(arr, largest, heapSize);
        }
    }
    // 交换元素
    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
