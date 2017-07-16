package net.aryaman.algo.matrix;

import java.util.Arrays;

public class RotationArray {
    public static void main(String[] args) {
        RotationArray ra = new RotationArray();
        int[] array = {67, 55, 99, 32, 102, 235, 61, 58, 43, 341};
        int[] newArray = ra.newRotateArrayRight(array, -2);
        System.out.println("Rotated right: " + Arrays.toString(newArray));

    }

    public int[] rotateArrayRight(int[] array, int k) {
        int remainder = k % (array.length);

        for (int i = 0; i < remainder; i++) {
            int lastElement = array[array.length-1];
            for (int j = array.length-1; j >= 1; j--) {
                array[j] = array[j-1];

            }
            array[0] = lastElement;
        }
        return array;
    }

    public int[] rotateArrayLeft(int[] array, int k) {
        int remainder = k % (array.length);

        for (int i = 0; i < remainder; i++) {
            int firstElement = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];

            }
            array[array.length-1] = firstElement;
        }
        return array;
    }
    public int[] newRotateArrayRight(int[] array, int k) {

        reverse(array, 0, array.length-1);
        reverse(array, k, array.length-1);
        reverse(array, 0, k-1);

        return array;
    }
    public int[] newRotateArrayLeft(int[] array, int k) {

        reverse(array, 0, array.length-1);
        reverse(array, array.length - k, array.length-1);
        reverse(array, 0, array.length-1 - k);
        return array;
    }



    public void reverse(int[] array, int beginIndex, int endIndex) {
        while (beginIndex <= endIndex) {
            int temp = array[beginIndex];
            array[beginIndex] = array[endIndex];
            array[endIndex] = temp;

            beginIndex++;
            endIndex--;
        }
    }
}