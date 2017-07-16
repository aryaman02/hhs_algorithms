package net.aryaman.algo.matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {
        MatrixMultiplication m = new MatrixMultiplication();
        int[][] matrix = {{4, 3}, {1, 8}};
        System.out.println(m.determinantOf2x2Matrix(matrix));

    }
    public int[][] mulitplyTwoMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            return null;
        }
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                matrixC[i][j] = 0;

                for (int k = 0; k < matrixA[0].length; k++) {

                    int element1 = matrixA[i][k];
                    int element2 = matrixB[k][j];
                    int element3 = element1 * element2;

                    matrixC[i][j] += element3;
                }
            }
        }
        return matrixC;
    }
    public int determinantOf2x2Matrix(int[][] matrix) {
        if (matrix.length != 2 && matrix[0].length != 2) {
            return -1;
        } else if (matrix.length != 2 || matrix[0].length != 2) {
            return -1;
        } else {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
    }
}
