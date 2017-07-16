package net.aryaman.algo.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class HeapSort {

    private int arrayLen;

    public static void main2(String[] args) {
        HeapSort hs = new HeapSort();
        int[] array = { 6, 3, 14, 21, 15, 10, 1, 18 };
        // int[] array = {};
        int[] resultArray = hs.sortArray(array);
        System.out.println(Arrays.toString(resultArray));
    }

    public static void main1(String[] args) {
        HeapSort hs = new HeapSort();
        int[] array = { 6, 3, 14, 21, 15, 10, 1, 18 };
        // int[] array = {};

        try {
            int[] resultArray = hs.sortArray(new int[0]);
            System.out.println("sortArray done");
            System.out.println(Arrays.toString(resultArray));
        } catch (ZeroLengthArrayException ex) {
            System.out.println("Got exception: " + ex.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println("Got exception: " + ex.toString());
        }
    }

    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        int[] array = { 6, 3, 14, 21, 15, 10, 1, 18 };
        // int[] array = {};

        try {
            int[] resultArray = hs.sortArray(null);
            System.out.println("sortArray done");
            System.out.println(Arrays.toString(resultArray));
        } catch (Exception e) {
            System.out.println("Got exception: " + e.toString());
        }

        Properties props = System.getProperties();
        props.list(System.out);

        System.out.println("HOME DIR: " + System.getProperty("user.home"));
    }


    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private void maxheap(int[] array, int i) {
        int left = 2 * i;
        int right = 2 * i + 1;

        if (right <= arrayLen - 1) {
            if (array[right] > array[left]) {
                if (array[right] > array[i]) {
                    swap(array, right, i);
                    i = right;
                } else {
                    return;
                }
            } else {
                if (array[left] > array[i]) {
                    swap(array, left, i);
                    i = left;
                } else {
                    return;
                }
            }
        } else if (left <= arrayLen - 1) {
            if (array[left] > array[i]) {
                swap(array, left, i);
                i = left;
            } else {
                return;
            }

        } else {
            return;
        }

        if (i > arrayLen) {
            return;
        }
        maxheap(array, i);
    }

    private void heapify(int[] array) {
        for (int i = (arrayLen) / 2; i > 0; i--) {
            maxheap(array, i);
        }
    }

    public int[] sortArray(int[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Null array passed");
        }

        if (array.length == 0) {
            throw new ZeroLengthArrayException("Zero-length array passed");
        }

        int[] heapArray = new int[array.length + 1];

        System.arraycopy(array, 0, heapArray, 1, array.length);
        List<Integer> resultArray2 = new ArrayList<>();
        arrayLen = heapArray.length;

        heapify(heapArray);
        int largestVal = heapArray[1];
        resultArray2.add(largestVal);

        while (resultArray2.size() < array.length) {
            swap(heapArray, arrayLen - 1, 1);
            arrayLen--;
            maxheap(heapArray, 1);

            resultArray2.add(heapArray[1]);
        }
        int[] resultArray = new int[resultArray2.size()];

        for (int i = 0; i < resultArray2.size(); i++) {
            resultArray[i] = resultArray2.get(i);
        }
        return resultArray;
    }
}