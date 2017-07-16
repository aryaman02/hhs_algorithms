package net.aryaman.algo.matrix;

import java.util.Arrays;

public class ReverseMatrix {
    public static void main(String[] args) {
        ReverseMatrix rm = new ReverseMatrix();
        int[][] matrix = { { 3, 2, 9 }, { 4, 1, 8 }, { 9, 5, 7 }, { 12, 11, 14 }, { 20, 21, 22 } };
        rm.rotateMatrix180(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public void reverseRows(int[][] matrix) {
        for (int i = 0, j = matrix.length - 1; i < j; i++, j--) {

            if (matrix[i] != matrix[j]) {
                int[] temp = matrix[i];
                matrix[i] = matrix[j];
                matrix[j] = temp;
            }
        }
    }

    public void reverseColumns(int[][] matrix2) {
        for (int i = 0; i < matrix2.length; i++) {
            int[] row = matrix2[i];

            for (int j = 0, k = row.length - 1; j < k; j++, k--) {
                if (row[j] != row[k]) {
                    int temp = row[j];
                    row[j] = row[k];
                    row[k] = temp;
                }
            }
        }
    }

    public void rotateMatrix180(int[][] matrix) {
        for (int i = 0, j = matrix.length - 1; i <= j; i++, j--) {

            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;

            reverseArrayForLoop(matrix[i]);

            if (i != j) {
                reverseArrayForLoop(matrix[j]);
            }
        }
    }

    public void reverseArrayForLoop(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (array[i] != array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
    }
}
