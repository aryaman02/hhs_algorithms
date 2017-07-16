package net.aryaman.algo.misc;

import java.util.Arrays;

public class MatrixReversal {

    public static void main(String[] args) {
        MatrixReversal mr = new MatrixReversal();

        int[][] matrix = {{2,5,1, 4, 6}, {8,3,9, 3, 9}, {7,3,2, 8, 5}, {4, 6, 3, 9, 7}};
        mr.printMatrix(matrix);
        System.out.println();
        mr.upsideDownMatrix(matrix);
        mr.printMatrix(matrix);
        /*
        int[] a = {5, 4, 6, 7, 8};
        int[] b = {3, 7, 9, 8, 4, 3, 1};

        mr.swapArrays(a,  b); */
    }

    public void reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (true) {
            if (i >= j) {
                break;
            }

            if (array[i] != array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            i++;
            j--;
        }
    }

    public void reverseMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
        }

        printMatrix(matrix);
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            System.out.println(Arrays.toString(row));
        }
    }

    public void swapArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            System.out.println("THe array lengths are not the same : " + a1.length + "   " + a2.length);
            return;
        }

        for (int i = 0; i < a1.length; i++) {
            int temp = a1[i];
            a1[i] = a2[i];
            a2[i] = temp;
        }
    }

    public void upsideDownMatrix(int[][] matrix) {
        int i = 0;
        int j = matrix.length-1;

        while (true) {
            int[] row1 = matrix[i];
            int[] row2 = matrix[j];

            if (i >= j) {
                break;
            }
            swapArrays(row1, row2);
            i++;
            j--;
        }
    }
}
