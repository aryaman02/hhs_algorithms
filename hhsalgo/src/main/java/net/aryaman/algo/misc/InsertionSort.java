package net.aryaman.algo.misc;

import java.util.Arrays;

public class InsertionSort {

    public void bubbleUp(int[] array, int originalPos, int position) {

        for (int i = originalPos; i > position; i--) {
            int temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        MyArrayUtils au = new MyArrayUtils();
        
        
       int[] array = au.generateArray(10);
       int[] arrayclone = new int[array.length];
       System.arraycopy(array,  0,  arrayclone,  0,  array.length);
        
        InsertionSort i = new InsertionSort();
        i.insertionSort(array);
        System.out.println("The new array is: " + Arrays.toString(array));
        i.bubbleSort(arrayclone);
        
        System.out.println("The new array is: " + Arrays.toString(arrayclone));
    }

    public void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;

            while (j >= 0) {

                if (array[i] > array[j]) {
                    break;

                } else {
                    j--;

                }
            }

            bubbleUp(array, i, j + 1);
        }
    }
    public void bubbleSort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    
                }
            }
        }
        
    }
}