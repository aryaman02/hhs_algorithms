package net.aryaman.algo.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxHeapSorter {
    private int arrayLen;

    private int[] sortedArray;

    public static void main(String[] args) {
        MaxHeapSorter hs = new MaxHeapSorter();
        int[] array = { 60, 30, 140, 210, 150, 100, 10, 180 };
        // int[] array = {};
        int[] resultArray = hs.sortArray(array);
        System.out.println(Arrays.toString(resultArray));

        int[] numbersToAdd = {129, 196, 247, 61, 221};

        for (int number : numbersToAdd) {
            hs.addNumber(number);
            System.out.println(number);
            hs.print();
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private int getBiggerChildIndex(int[] array, int parent) {
        int left = 2 * parent;
        int right = 2 * parent + 1;

        if (right >= arrayLen) {
            return right;
        }

        if (array[right] > array[left]) {
            return right;
        } else {
            return left;
        }
    }

    private void maxheap(int[] array, int i) {

        while (i < arrayLen) {
            int biggerChild = getBiggerChildIndex(array, i);

            if (biggerChild < arrayLen) {

                if (array[biggerChild] > array[i]) {
                    swap(array, biggerChild, i);
                    i = biggerChild;
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
            maxheap(array, i);
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

        sortedArray = new int[resultArray.length+1];
        sortedArray[0] = -1;
        System.arraycopy(resultArray, 0, sortedArray, 1, resultArray.length);
        arrayLen = heapArray.length;
        return resultArray;
    }

    private boolean canAddNumber(int number) {
        if (number < sortedArray[1]) {
            return true;
        }
        return false;
    }

    public void addNumber(int number) {
        if (canAddNumber(number)) {
            sortedArray[1] = number;
            maxheap(sortedArray, 1);
        }
    }

    public void print() {
        for (int i = 1; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}