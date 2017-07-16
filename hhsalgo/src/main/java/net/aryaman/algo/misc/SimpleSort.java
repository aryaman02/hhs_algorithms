package net.aryaman.algo.misc;

import java.util.Random;
import java.util.Arrays;

public class SimpleSort {

    /**
     * Generate an array of count random numbers
     *
     * @param count
     * @return array
     */
    public int[] generateArray(int count) {

        int[] array = new int[count];

        Random r = new Random();
        for (int i = 0; i < count; i++) {
            int randnum = r.nextInt(500);
            array[i] = randnum;
        }

        return array;
    }

    /**
     * This function should do the following: swap the values at indexa and
     * indexb
     * 
     * @param numbers
     * @param indexa
     * @param indexb
     */
    public void swap(int[] numbers, int indexa, int indexb) {

        if (indexa > numbers.length - 1) {
            System.out.println("Cannot pass this number: " + indexa);
            return;
        }
        if (indexb > numbers.length - 1) {
            System.out.println("Cannot pass this number: " + indexb);
            return;
        }

        int temp = numbers[indexa];
        numbers[indexa] = numbers[indexb];
        numbers[indexb] = temp;
    }

    /**
     * Given a cursor position, bubble up the smallest number below the cursor
     * to the cursor position.
     *
     * @param array
     * @param cursor
     */
    public void smallnumtotop(int[] array, int cursor) {

        for (int i = cursor + 1; i < array.length; i++) {
            if (array[i] < array[cursor]) {
                swap(array, i, cursor);

            }
        }
    }

    public void bubblesort(int[] array) {

        for (int cursor = 0; cursor < array.length - 1; cursor++) {
            smallnumtotop(array, cursor);

        }
    }

    public void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + "  ");
        }
        System.out.println();
    }

    /**
     * Return the position of the largest number in the array.
     *
     * @param array
     */
    public int findLargestNumberIndex(int[] array, int beginindex) {
        int position = beginindex;

        for (int i = beginindex; i < array.length; i++) {
            int temp = array[i];

            if (temp > array[position]) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Return the position of the smallest number in the array.
     *
     * @param array
     */
    public int findSmallestNumberIndex(int[] array, int beginindex) {
        int position = beginindex;

        for (int i = beginindex; i < array.length; i++) {
            int temp = array[i];

            if (temp < array[position]) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Performs selection sort on the input array
     * 
     * @param array
     */
    public void selectionSort(int[] array) {
        int beginindex = 0;

        while (beginindex < array.length - 1) {
            int position = findLargestNumberIndex(array, beginindex);

            if (array[beginindex] < array[position]) {
                swap(array, beginindex, position);
            }
            beginindex = beginindex + 1;

        }
        System.out.println("New array: " + Arrays.toString(array));
    }

    public void selectionSortReverse(int[] array) {
        int beginindex = 0;

        while (beginindex < array.length - 1) {
            int position = findSmallestNumberIndex(array, beginindex);

            if (array[beginindex] > array[position]) {
                swap(array, beginindex, position);
            }
            beginindex = beginindex + 1;

        }
        System.out.println("New array: " + Arrays.toString(array));
    }
}
