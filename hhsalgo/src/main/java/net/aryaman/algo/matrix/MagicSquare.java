package net.aryaman.algo.matrix;

public class MagicSquare {
    public static void main(String[] args) {
        MagicSquare ms = new MagicSquare();
        // int[][] matrix = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        // int[][] matrix = ms.generateMagicSquare(3);
        int[][] matrix = {{2, 7, 6}, {9, 4, 1}, {4, 3, 8}};
        ms.printMatrix(matrix);
        System.out.println(ms.isMatrixMagicSquare(matrix));
    }

    public int[][] generateMagicSquare(int n) {
        if (n <= 0) {
            return null;
        } else if (ifNumberisEven(n)) {
            return null;
        }

        int[][] magSquare = new int[n][n];

        /*
         * Initial values of i and j to put the first number (1)
         */
        int i = n / 2;
        int j = n - 1;
        magSquare[i][j] = 1;

        /*
         * Now start from number 2. k indicates the next number we want to
         * place.
         */
        for (int k = 2; k <= n * n; k++) {
            /*
             * Recompute i, j to be diagonally top-right.
             */
            i = i - 1;
            j = j + 1;

            if (i < 0 && j > n - 1) {
                i = i + 1;
                j = j - 2;
                magSquare[i][j] = k;
            } else if (i < 0) {
                i = n - 1;
                magSquare[i][j] = k;
            } else if (j > n - 1) {
                j = 0;
                magSquare[i][j] = k;
            } else if (magSquare[i][j] > 0) {
                i = i + 1;
                j = j - 2;
                magSquare[i][j] = k;
            } else {
                magSquare[i][j] = k;
            }
        }
        return magSquare;
    }

    public boolean ifNumberisEven(int number) {
        return (number % 2 == 0);
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);

                String s = String.valueOf(matrix[i][j]);

                int numSpaces = 5 - s.length();
                for (int k = 0; k < numSpaces; k++) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public boolean isMatrixMagicSquareRow(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int firstRowSum = 0;
        int[] firstRow = matrix[0];

        for (int i = 0; i < firstRow.length; i++) {
            firstRowSum += firstRow[i];
        }

        for (int i = 1; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
            }

            if (rowSum == firstRowSum) {
                // keep checking next rows
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isMatrixMagicSquareColumn(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int firstColumnSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            firstColumnSum += matrix[i][0];
        }

        for (int colIndex = 1; colIndex < matrix.length; colIndex++) {
            int columnSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                columnSum += matrix[j][colIndex];
            }
            if (columnSum == firstColumnSum) {

            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isMatrixMagicSquareDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int firstRowSum = 0;
        int[] firstRow = matrix[0];

        for (int i = 0; i < firstRow.length; i++) {
            firstRowSum += firstRow[i];
        }
        int diag1Sum = 0;

        for (int j = 0; j < matrix.length; j++) {
            diag1Sum += matrix[j][j];
        }
        int diag2Sum = 0;

        for (int k = 0; k < matrix.length; k++) {
            diag2Sum += matrix[k][(matrix.length - 1) - k];
        }

        if (diag1Sum == firstRowSum && diag2Sum == firstRowSum) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMatrixMagicSquare(int[][] matrix) {
        if (isMatrixMagicSquareRow(matrix) && isMatrixMagicSquareColumn(matrix) && isMatrixMagicSquareDiagonal(matrix)) {
            return true;
        } else {
            return false;
        }
    }
}
