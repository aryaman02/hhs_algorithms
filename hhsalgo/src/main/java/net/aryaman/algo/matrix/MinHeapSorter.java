package net.aryaman.algo.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeapSorter {
    private int arrayLen;

    public static void main(String[] args) {
        MinHeapSorter hs = new MinHeapSorter();
        int[] array = { 6, 3, 14, 21, 15, 10, 1, 18 };
        // int[] array = {};
        int[] resultArray = hs.sortArray(array);
        System.out.println(Arrays.toString(resultArray));
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private int getSmallerChildIndex(int[] array, int parent) {
        int left = 2 * parent;
        int right = 2 * parent + 1;

        if (right >= arrayLen) {
            return right;
        }

        if (array[right] > array[left]) {
            return left;
        } else {
            return right;
        }
    }

    private void minheap(int[] array, int i) {

        while (i < arrayLen) {
            int smallerChild = getSmallerChildIndex(array, i);

            if (smallerChild < arrayLen) {

                if (array[smallerChild] < array[i]) {
                    swap(array, smallerChild, i);
                    i = smallerChild;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void heapify(int[] array) {
        for (int i = (arrayLen) / 2; i > 0; i--) {
            minheap(array, i);
        }
    }

    public int[] sortArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int[] heapArray = new int[array.length + 1];

        System.arraycopy(array, 0, heapArray, 1, array.length);
        List<Integer> resultArray2 = new ArrayList<>();
        arrayLen = heapArray.length;

        heapify(heapArray);
        int smallestVal = heapArray[1];
        resultArray2.add(smallestVal);

        while (resultArray2.size() < array.length) {
            swap(heapArray, arrayLen - 1, 1);
            arrayLen--;
            minheap(heapArray, 1);

            resultArray2.add(heapArray[1]);
        }
        int[] resultArray = new int[resultArray2.size()];

        for (int i = 0; i < resultArray2.size(); i++) {
            resultArray[i] = resultArray2.get(i);
        }
        return resultArray;
    }
}