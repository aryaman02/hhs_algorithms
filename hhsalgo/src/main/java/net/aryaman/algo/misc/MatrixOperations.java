package net.aryaman.algo.misc;

public class MatrixOperations {

    public static void main(String[] args) {
        MatrixOperations mo = new MatrixOperations();
        int[][] mat1= {{1,7, 4}, {8,5, 3}};
        int[][] mat2 = {{3,6, 1}, {2,9, 7}};
        int[][] matsum = mo.addMatrices(mat1, mat2);
    }
    public int[][] addMatrices(int[][] mat1, int[][] mat2) {

        if (mat1.length != mat2.length) {
            System.out.println("The two matrices do not have same number of rows");
            return null;
        }

        int[] mat1row0 = mat1[0];
        int[] mat2row0 = mat2[0];

        if (mat1row0.length != mat2row0.length) {
            System.out.println("The two matrices do not have same number of columns");
            return null;
        }

        int numRows = mat1.length;
        int numCols = mat1row0.length;

        int[][] matsum = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {

                int entry1 = mat1[i][j];
                int entry2 = mat2[i][j];

                matsum[i][j] = entry1 - entry2;
            }
        }

        for (int k = 0; k < numRows; k++) {
            for (int h = 0; h < numCols; h++) {
                System.out.print("  " + matsum[k][h]);
            }
            System.out.println();
        }
        return matsum;
    }
}
