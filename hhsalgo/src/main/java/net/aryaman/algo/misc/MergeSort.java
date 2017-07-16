package net.aryaman.algo.misc;

import java.util.Arrays;


public class MergeSort {
    public static void main1(String[] args) {
        MergeSort ms = new MergeSort();
        //int[] a1 = { 1, 3, 4, 7, 8 };
        //int[] a2 = { 2, 3, 8, 9 };
        //int[] resultArray = ms.mergeSortedArrays(a1, a2);
        //System.out.println(Arrays.toString(resultArray));

        int[] array = {2,7,1,9,1,3,4,7,8,2,3,8,9,5,9,0,1};
        System.out.println("Original array: " + Arrays.toString(array));
        ms.mergeArrayinPlace(array, 4, 8, 12);
        System.out.println("New array: " + Arrays.toString(array));

    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();

        MyArrayUtils utils = new MyArrayUtils();
        int[] array = utils.generateArray(40);
        //int[] array = {7, 3, 5, 1, 15, 9, 4, 22, 0};
        System.out.println("Original array: " + Arrays.toString(array));
        ms.mergeSort(array, 0, array.length-1);
        System.out.println("New array: " + Arrays.toString(array));

    }

    public int[] mergeSortedArrays(int[] a1, int[] a2) {
        int[] resultArray = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (true) {
            if (a1[i] <= a2[j]) {
                resultArray[k] = a1[i];
                i++;

            } else if (a2[j] <= a1[i]) {
                resultArray[k] = a2[j];
                j++;

            }
            k++;
            if (i == a1.length) {
                break;
            }
            if (j == a2.length) {
                break;
            }
        }

        while (i < a1.length) {
            resultArray[k] = a1[i];
            i++;
            k++;
        }
        while (j < a2.length) {
            resultArray[k] = a2[j];
            j++;
            k++;
        }
        return resultArray;

    }

    /**
     * Merge two sorted sub-arrays in-place.
     *
     * @param array
     * @param m begin index of the left sub-array
     * @param p end index of the left sub-array
     * @param n end index of the right sub-array (begin index is p+1)
     */
    public void mergeArrayinPlace(int[] array, int m, int p, int n) {
        int[] resultArray = new int[(n-m+1)];
        int i = m;
        int j = p+1;
        int k = 0;

        while (i <= p && j <= n) {
            if (array[i] <= array[j]) {
                resultArray[k] = array[i];
                i++;

            } else if (array[j] <= array[i]) {
                resultArray[k] = array[j];
                j++;

            }
            k++;
        }

        while (i <= p) {
            resultArray[k] = array[i];
            i++;
            k++;
        }
        while (j <= n) {
            resultArray[k] = array[j];
            j++;
            k++;
        }

        for (int h = 0; h < (n-m+1); h++) {
            array[(m+h)] = resultArray[h];
        }
    }

    /**
     * Implementation of merge-sort algorithm
     *
     * @param array to be sorted
     * @param m begin index
     * @param n end index
     */
    public void mergeSort(int[] array, int m, int n) {
        System.out.println("mergeSort m: " + m + " n: " + n);
        if (m >= n) {
            return;
        }

        if (m == n-1) {
            if (array[m] > array[n]) {
                int temp = array[m];
                array[m] = array[n];
                array[n] = temp;
            }

            return;
        }

        int p = (m+n)/2;
        mergeSort(array, m, p);
        mergeSort(array, p+1, n);
        mergeArrayinPlace(array, m, p, n);
    }
}