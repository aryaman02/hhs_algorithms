package net.aryaman.algo.misc;

import java.util.Arrays;
import java.util.Random;

public class Math2 {
    public static void main(String[] args) {
        Math2 m2 = new Math2();
        int dieNum = m2.dieSimulation(3);
        System.out.println(" The computer rolled a " + dieNum);
        m2.convert2(29);
        int[][] matrix = {{3, 5, 7}, {5, 9, 8}, {2, 0, 1}, {6, 2, 7}, {9, 1, 5}};
        m2.findRowandColumnSum(matrix);
    }
    public int dieSimulation(int number) {
        final Random r = new Random();
        int dieNum = r.nextInt(6);

        if (dieNum != number) {
            System.out.println("You lost");

        } else {
            System.out.println("You won");
        }
        if (number > 6 || dieNum == 0) {
            System.out.println("This is a 6-sided die");
            return -1;
        }
        return dieNum;
    }
    public void convert2(int days) {
        if (days < 30) {
            System.out.println(days + " days");
        } else {
            int months = days / 30;
            int days2 = days % 30;
            System.out.println("Months: " + months + " days: " + days2);
        }
    }
    public void findRowandColumnSum(int[][] matrix) {
        int[] rowSums = new int[matrix.length];
        int[] columnSums = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int[] row = matrix[i];
            for (int elem : row) {
                rowSum += elem;
            }
            rowSums[i] = rowSum;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                columnSum += matrix[j][i];
            }
            columnSums[i] = columnSum;
        }

        System.out.println(Arrays.toString(rowSums));
        System.out.println(Arrays.toString(columnSums));
    }
}
