package net.aryaman.algo.misc;


public class TwoDimensionalArrayDriver {

    public static void main(String[] args) {
        int[][] array = { { 2, 3, 6, 7 }, { 9, 8, 5, 2 }, { 8, 6, 4, 1 }, { 7, 6, 3, 8 } };
        TwoDimensionalArrayDriver t = new TwoDimensionalArrayDriver();

        int sum2 = t.sumOfDiagonalElements(array);
        System.out.println(sum2);

    }

    public void display(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int element = array[i][j];
                System.out.print(" " + element);

            }
            System.out.println();
        }
    }

    public int sumOfElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];

            }
        }
        return sum;
    }

    public int sumOfDiagonalElements(int[][] array) {
        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (i == j) {
                    sum2 = sum2 + array[i][j];

                }
            }
        }
        return sum2;
    }

    public int[] sumarray(int[][] array) {
        int[] sums = new int[4];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];

            }
            System.out.println("The sum in row: " + i + " is " + sum);
            sums[i] = sum;
        }
        return sums;

    }
    public int[] columnSum(int[][] array) {
        int[] sums2 = new int[4];
        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            sum2 = 0;
            for (int j = 0; j < array.length; j++) {
                sum2 += array[j][i];

            }
            System.out.println("The sum in column: " + i + " is " + sum2);
            sums2[i] = sum2;
        }
        return sums2;
    }
    public int sumofCorners(int[][] array) {
        int sum3 = 0;
        sum3 = array[0][0] + array[0][array.length-1] + array[array.length-1][array.length-1] + array[array.length-1][0];

        return sum3;
    }
}
