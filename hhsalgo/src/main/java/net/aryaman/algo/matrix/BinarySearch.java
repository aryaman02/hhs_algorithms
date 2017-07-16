package net.aryaman.algo.matrix;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {4, 1, 7, 3, 12, 14, 15, 8};

        System.out.println(bs.binarySearch(array, 0, array.length-1, 15));

    }

    /**
     * Binary search for a given number. If the number is found, return its
     * index. If the number is not found, then return -1
     * 
     * Complexity: O(logN)
     */
    public int binarySearch(int[] array, int beginIndex, int endIndex, int number) {
        Arrays.sort(array);

        if (array == null) {
            return -1;
        }
        if (beginIndex > endIndex) {
            return -1;
        }
        if (number > array[endIndex] || number < array[beginIndex]) {
            return -1;
        }
        int midpoint = (beginIndex + endIndex) / 2;

        if (number > array[midpoint]) {
            return binarySearch(array, midpoint + 1, endIndex, number);

        } else if (number < array[midpoint]) {
            return binarySearch(array, beginIndex, midpoint - 1, number);

        } else {
            return midpoint;
        }

    }

}
